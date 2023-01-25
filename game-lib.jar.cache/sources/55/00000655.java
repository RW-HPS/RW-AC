package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.gameFramework.C0742br;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.java.audio.p051a.C1165a;
import com.corrodinggames.rts.java.audio.p051a.C1183s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg.class */
public class Ogg {

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg$Music.class */
    public class Music extends OpenALMusic {
        private OggInputStream input;
        private OggInputStream previousInput;

        public Music(OpenALAudio openALAudio, C1165a c1165a) {
            super(openALAudio, c1165a);
            if (openALAudio.noDevice) {
                return;
            }
            this.input = new OggInputStream(c1165a.m383a());
            setup(this.input.getChannels(), this.input.getSampleRate());
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public int read(byte[] bArr) {
            if (this.input == null) {
                this.input = new OggInputStream(this.file.m383a(), this.previousInput);
                setup(this.input.getChannels(), this.input.getSampleRate());
                this.previousInput = null;
            }
            return this.input.read(bArr);
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public void reset() {
            C1183s.m307a(this.input);
            this.previousInput = null;
            this.input = null;
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        protected void loop() {
            C1183s.m307a(this.input);
            this.previousInput = this.input;
            this.input = null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg$MusicWithThreadedLoader.class */
    public class MusicWithThreadedLoader extends OpenALMusic {
        private OggInputStream input;
        private OggInputStream previousInput;
        ThreadedWrappingAudioInputStream backgroundInput;

        public MusicWithThreadedLoader(OpenALAudio openALAudio, C1165a c1165a) {
            super(openALAudio, c1165a);
            if (openALAudio.noDevice) {
                return;
            }
            this.input = new OggInputStream(c1165a.m383a());
            setup(this.input.getChannels(), this.input.getSampleRate());
            this.backgroundInput = new ThreadedWrappingAudioInputStream(this.input);
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public int read(byte[] bArr) {
            double m2438a;
            if (this.input == null) {
                this.input = new OggInputStream(this.file.m383a(), this.previousInput);
                setup(this.input.getChannels(), this.input.getSampleRate());
                this.previousInput = null;
                this.backgroundInput = new ThreadedWrappingAudioInputStream(this.input);
            }
            long m2440a = C0742br.m2440a();
            int read = this.backgroundInput.read(bArr);
            if (C0742br.m2438a(m2440a) > 0.5d) {
                GameEngine.m5460e("ogg read took:" + C0742br.m2439a(m2438a));
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
            C1183s.m307a(this.input);
            this.previousInput = null;
            this.input = null;
            this.backgroundInput.close();
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        protected void loop() {
            C1183s.m307a(this.input);
            this.previousInput = this.input;
            this.input = null;
            this.backgroundInput.close();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg$Sound.class */
    public class Sound extends OpenALSound {
        public Sound(OpenALAudio openALAudio, C1165a c1165a) {
            super(openALAudio);
            int read;
            if (openALAudio.noDevice) {
                return;
            }
            OggInputStream oggInputStream = null;
            try {
                oggInputStream = new OggInputStream(c1165a.m383a());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
                byte[] bArr = new byte[2048];
                while (!oggInputStream.atEnd() && (read = oggInputStream.read(bArr)) != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                setup(byteArrayOutputStream.toByteArray(), oggInputStream.getChannels(), oggInputStream.getSampleRate());
                C1183s.m307a(oggInputStream);
            } catch (Throwable th) {
                C1183s.m307a(oggInputStream);
                throw th;
            }
        }
    }
}