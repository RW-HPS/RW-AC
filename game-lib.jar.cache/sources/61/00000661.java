package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.java.audio.a.a;
import com.corrodinggames.rts.java.audio.a.c;
import com.corrodinggames.rts.java.audio.a.s;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Wav.class */
public class Wav {

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Wav$Music.class */
    public class Music extends OpenALMusic {
        private WavInputStream input;

        public Music(OpenALAudio openALAudio, a aVar) {
            super(openALAudio, aVar);
            this.input = new WavInputStream(aVar);
            if (openALAudio.noDevice) {
                return;
            }
            setup(this.input.channels, this.input.sampleRate);
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public int read(byte[] bArr) {
            if (this.input == null) {
                this.input = new WavInputStream(this.file);
                setup(this.input.channels, this.input.sampleRate);
            }
            try {
                return this.input.read(bArr);
            } catch (IOException e) {
                throw new c("Error reading WAV file: " + this.file, e);
            }
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public void reset() {
            s.a(this.input);
            this.input = null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Wav$Sound.class */
    public class Sound extends OpenALSound {
        public Sound(OpenALAudio openALAudio, a aVar) {
            super(openALAudio);
            if (openALAudio.noDevice) {
                return;
            }
            WavInputStream wavInputStream = null;
            try {
                try {
                    wavInputStream = new WavInputStream(aVar);
                    setup(s.a(wavInputStream, wavInputStream.dataRemaining), wavInputStream.channels, wavInputStream.sampleRate);
                    s.a(wavInputStream);
                } catch (IOException e) {
                    throw new c("Error reading WAV file: " + aVar, e);
                }
            } catch (Throwable th) {
                s.a(wavInputStream);
                throw th;
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Wav$WavInputStream.class */
    public class WavInputStream extends FilterInputStream {
        public int channels;
        public int sampleRate;
        public int dataRemaining;

        public WavInputStream(a aVar) {
            super(aVar.a());
            String str;
            try {
                if (read() != 82 || read() != 73 || read() != 70 || read() != 70) {
                    throw new c("RIFF header not found: " + aVar);
                }
                skipFully(4);
                if (read() != 87 || read() != 65 || read() != 86 || read() != 69) {
                    throw new c("Invalid wave file header: " + aVar);
                }
                int seekToChunk = seekToChunk('f', 'm', 't', ' ');
                int read = (read() & 255) | ((read() & 255) << 8);
                if (read != 1) {
                    switch (read) {
                        case 2:
                            str = "ADPCM";
                            break;
                        case 3:
                            str = "IEEE float";
                            break;
                        case 6:
                            str = "8-bit ITU-T G.711 A-law";
                            break;
                        case 7:
                            str = "8-bit ITU-T G.711 u-law";
                            break;
                        case 65534:
                            str = "Extensible";
                            break;
                        default:
                            str = "Unknown";
                            break;
                    }
                    throw new c("WAV files must be PCM, unsupported format: " + str + " (" + read + ")");
                }
                this.channels = (read() & 255) | ((read() & 255) << 8);
                if (this.channels != 1 && this.channels != 2) {
                    throw new c("WAV files must have 1 or 2 channels: " + this.channels);
                }
                this.sampleRate = (read() & 255) | ((read() & 255) << 8) | ((read() & 255) << 16) | ((read() & 255) << 24);
                skipFully(6);
                int read2 = (read() & 255) | ((read() & 255) << 8);
                if (read2 != 16) {
                    throw new c("WAV files must have 16 bits per sample: " + read2);
                }
                skipFully(seekToChunk - 16);
                this.dataRemaining = seekToChunk('d', 'a', 't', 'a');
            } catch (Throwable th) {
                s.a(this);
                throw new c("Error reading WAV file: " + aVar, th);
            }
        }

        private int seekToChunk(char c, char c2, char c3, char c4) {
            while (true) {
                boolean z = (read() == c) & (read() == c2) & (read() == c3) & (read() == c4);
                int read = (read() & 255) | ((read() & 255) << 8) | ((read() & 255) << 16) | ((read() & 255) << 24);
                if (read == -1) {
                    throw new IOException("Chunk not found: " + c + c2 + c3 + c4);
                }
                if (z) {
                    return read;
                }
                skipFully(read);
            }
        }

        private void skipFully(int i) {
            while (i > 0) {
                long skip = this.in.skip(i);
                if (skip <= 0) {
                    throw new EOFException("Unable to skip.");
                }
                i = (int) (i - skip);
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr) {
            int min;
            if (this.dataRemaining == 0 || (min = Math.min(super.read(bArr), this.dataRemaining)) == -1) {
                return -1;
            }
            this.dataRemaining -= min;
            return min;
        }
    }
}