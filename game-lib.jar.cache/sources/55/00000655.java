package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.br;
import com.corrodinggames.rts.java.audio.a.a;
import com.corrodinggames.rts.java.audio.a.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg.class */
public class Ogg {

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg$Music.class */
    public class Music extends OpenALMusic {
        private OggInputStream input;
        private OggInputStream previousInput;

        public Music(OpenALAudio openALAudio, a aVar) {
            super(openALAudio, aVar);
            if (openALAudio.noDevice) {
                return;
            }
            this.input = new OggInputStream(aVar.a());
            setup(this.input.getChannels(), this.input.getSampleRate());
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public int read(byte[] bArr) {
            if (this.input == null) {
                this.input = new OggInputStream(this.file.a(), this.previousInput);
                setup(this.input.getChannels(), this.input.getSampleRate());
                this.previousInput = null;
            }
            return this.input.read(bArr);
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public void reset() {
            s.a(this.input);
            this.previousInput = null;
            this.input = null;
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        protected void loop() {
            s.a(this.input);
            this.previousInput = this.input;
            this.input = null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg$MusicWithThreadedLoader.class */
    public class MusicWithThreadedLoader extends OpenALMusic {
        private OggInputStream input;
        private OggInputStream previousInput;
        ThreadedWrappingAudioInputStream backgroundInput;

        public MusicWithThreadedLoader(OpenALAudio openALAudio, a aVar) {
            super(openALAudio, aVar);
            if (openALAudio.noDevice) {
                return;
            }
            this.input = new OggInputStream(aVar.a());
            setup(this.input.getChannels(), this.input.getSampleRate());
            this.backgroundInput = new ThreadedWrappingAudioInputStream(this.input);
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public int read(byte[] bArr) {
            double a2;
            if (this.input == null) {
                this.input = new OggInputStream(this.file.a(), this.previousInput);
                setup(this.input.getChannels(), this.input.getSampleRate());
                this.previousInput = null;
                this.backgroundInput = new ThreadedWrappingAudioInputStream(this.input);
            }
            long a3 = br.a();
            int read = this.backgroundInput.read(bArr);
            if (br.a(a3) > 0.5d) {
                GameEngine.m328e("ogg read took:" + br.a(a2));
            }
            return read;
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public void backgroundUpdate() {
            try {
                if (this.input != null && this.backgroundInput != null) {
                    this.backgroundInput.backgroundFillBuffer();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public void reset() {
            s.a(this.input);
            this.previousInput = null;
            this.input = null;
            this.backgroundInput.close();
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        protected void loop() {
            s.a(this.input);
            this.previousInput = this.input;
            this.input = null;
            this.backgroundInput.close();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg$Sound.class */
    public class Sound extends OpenALSound {
        public Sound(OpenALAudio openALAudio, a aVar) {
            super(openALAudio);
            int read;
            if (openALAudio.noDevice) {
                return;
            }
            OggInputStream oggInputStream = null;
            try {
                oggInputStream = new OggInputStream(aVar.a());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
                byte[] bArr = new byte[2048];
                while (!oggInputStream.atEnd() && (read = oggInputStream.read(bArr)) != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                setup(byteArrayOutputStream.toByteArray(), oggInputStream.getChannels(), oggInputStream.getSampleRate());
                s.a(oggInputStream);
            } catch (Throwable th) {
                s.a(oggInputStream);
                throw th;
            }
        }
    }
}