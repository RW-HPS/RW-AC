package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.java.audio.Audio;
import com.corrodinggames.rts.java.audio.AudioDevice;
import com.corrodinggames.rts.java.audio.AudioRecorder;
import com.corrodinggames.rts.java.audio.lwjgl.Ogg;
import com.corrodinggames.rts.java.audio.lwjgl.Wav;
import com.corrodinggames.rts.java.audio.p051a.C1165a;
import com.corrodinggames.rts.java.audio.p051a.C1167c;
import com.corrodinggames.rts.java.audio.p051a.C1168d;
import com.corrodinggames.rts.java.audio.p051a.C1169e;
import com.corrodinggames.rts.java.audio.p051a.C1173i;
import com.corrodinggames.rts.java.audio.p051a.C1177m;
import com.corrodinggames.rts.java.audio.p051a.C1179o;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Locale;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.OpenALException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/OpenALAudio.class */
public class OpenALAudio implements Audio {
    private final int deviceBufferSize;
    private final int deviceBufferCount;
    private C1168d idleSources;
    private C1168d allSources;
    private C1173i soundIdToSource;
    private C1169e sourceToSoundId;
    private long nextSoundId;
    private C1179o extensionToSoundClass;
    private C1179o extensionToMusicClass;
    private OpenALSound[] recentSounds;
    private int mostRecetSound;
    ArrayList music;
    boolean noDevice;

    public OpenALAudio() {
        this(16, 9, 512);
    }

    public OpenALAudio(int i, int i2, int i3) {
        this.nextSoundId = 0L;
        this.extensionToSoundClass = new C1179o();
        this.extensionToMusicClass = new C1179o();
        this.mostRecetSound = -1;
        this.music = new ArrayList();
        this.noDevice = false;
        this.deviceBufferSize = i3;
        this.deviceBufferCount = i2;
        registerSound("ogg", Ogg.Sound.class);
        registerMusic("ogg", Ogg.Music.class);
        registerSound("wav", Wav.Sound.class);
        registerMusic("wav", Wav.Music.class);
        try {
            AL.create();
            this.allSources = new C1168d(false, i);
            for (int i4 = 0; i4 < i; i4++) {
                int alGenSources = AL10.alGenSources();
                if (AL10.alGetError() != 0) {
                    break;
                }
                this.allSources.m374a(alGenSources);
            }
            this.idleSources = new C1168d(this.allSources);
            this.soundIdToSource = new C1173i();
            this.sourceToSoundId = new C1169e();
            AL10.alListener(4111, (FloatBuffer) BufferUtils.createFloatBuffer(6).put(new float[]{0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f}).flip());
            AL10.alListener(4102, (FloatBuffer) BufferUtils.createFloatBuffer(3).put(new float[]{0.0f, 0.0f, 0.0f}).flip());
            AL10.alListener(4100, (FloatBuffer) BufferUtils.createFloatBuffer(3).put(new float[]{0.0f, 0.0f, 0.0f}).flip());
            this.recentSounds = new OpenALSound[i];
        } catch (LWJGLException e) {
            this.noDevice = true;
            e.printStackTrace();
        } catch (NullPointerException e2) {
            this.noDevice = true;
            e2.printStackTrace();
        } catch (OpenALException e3) {
            this.noDevice = true;
            e3.printStackTrace();
        }
    }

    public void registerSound(String str, Class cls) {
        if (str == null) {
            throw new IllegalArgumentException("extension cannot be null.");
        }
        if (cls == null) {
            throw new IllegalArgumentException("soundClass cannot be null.");
        }
        this.extensionToSoundClass.m324a(str, cls);
    }

    public void registerMusic(String str, Class cls) {
        if (str == null) {
            throw new IllegalArgumentException("extension cannot be null.");
        }
        if (cls == null) {
            throw new IllegalArgumentException("musicClass cannot be null.");
        }
        this.extensionToMusicClass.m324a(str, cls);
    }

    @Override // com.corrodinggames.rts.java.audio.Audio
    public OpenALSound newSound(C1165a c1165a) {
        if (c1165a == null) {
            throw new IllegalArgumentException("file cannot be null.");
        }
        Class cls = (Class) this.extensionToSoundClass.m325a(c1165a.m382b().toLowerCase(Locale.ROOT));
        if (cls == null) {
            throw new C1167c("Unknown file extension for sound: " + c1165a);
        }
        try {
            return (OpenALSound) cls.getConstructor(OpenALAudio.class, C1165a.class).newInstance(this, c1165a);
        } catch (Exception e) {
            throw new C1167c("Error creating sound " + cls.getName() + " for file: " + c1165a, e);
        }
    }

    @Override // com.corrodinggames.rts.java.audio.Audio
    public OpenALMusic newMusic(C1165a c1165a) {
        if (c1165a == null) {
            throw new IllegalArgumentException("file cannot be null.");
        }
        Class cls = (Class) this.extensionToMusicClass.m325a(c1165a.m382b().toLowerCase(Locale.ROOT));
        if (cls == null) {
            throw new C1167c("Unknown file extension for music: " + c1165a);
        }
        try {
            return (OpenALMusic) cls.getConstructor(OpenALAudio.class, C1165a.class).newInstance(this, c1165a);
        } catch (Exception e) {
            throw new C1167c("Error creating music " + cls.getName() + " for file: " + c1165a, e);
        }
    }

    int obtainSource(boolean z) {
        if (this.noDevice) {
            return 0;
        }
        int i = this.idleSources.f7225b;
        for (int i2 = 0; i2 < i; i2++) {
            int m373b = this.idleSources.m373b(i2);
            int alGetSourcei = AL10.alGetSourcei(m373b, 4112);
            if (alGetSourcei != 4114 && alGetSourcei != 4115) {
                if (z) {
                    this.idleSources.m372c(i2);
                } else {
                    if (this.sourceToSoundId.m359e(m373b)) {
                        long longValue = ((Long) this.sourceToSoundId.m369a(m373b)).longValue();
                        this.sourceToSoundId.m365b(m373b);
                        this.soundIdToSource.m344b(longValue);
                    }
                    long j = this.nextSoundId;
                    this.nextSoundId = j + 1;
                    this.sourceToSoundId.m368a(m373b, Long.valueOf(j));
                    this.soundIdToSource.m348a(j, Integer.valueOf(m373b));
                }
                AL10.alSourceStop(m373b);
                AL10.alSourcei(m373b, 4105, 0);
                AL10.alSourcef(m373b, 4106, 1.0f);
                AL10.alSourcef(m373b, 4099, 1.0f);
                AL10.alSource3f(m373b, 4100, 0.0f, 0.0f, 1.0f);
                return m373b;
            }
        }
        return -1;
    }

    void freeSource(int i) {
        if (this.noDevice) {
            return;
        }
        AL10.alSourceStop(i);
        AL10.alSourcei(i, 4105, 0);
        if (this.sourceToSoundId.m359e(i)) {
            this.soundIdToSource.m344b(((Long) this.sourceToSoundId.m365b(i)).longValue());
        }
        this.idleSources.m374a(i);
    }

    void freeBuffer(int i) {
        if (this.noDevice) {
            return;
        }
        int i2 = this.idleSources.f7225b;
        for (int i3 = 0; i3 < i2; i3++) {
            int m373b = this.idleSources.m373b(i3);
            if (AL10.alGetSourcei(m373b, 4105) == i) {
                if (this.sourceToSoundId.m359e(m373b)) {
                    this.soundIdToSource.m344b(((Long) this.sourceToSoundId.m365b(m373b)).longValue());
                }
                AL10.alSourceStop(m373b);
                AL10.alSourcei(m373b, 4105, 0);
            }
        }
    }

    void stopSourcesWithBuffer(int i) {
        if (this.noDevice) {
            return;
        }
        int i2 = this.idleSources.f7225b;
        for (int i3 = 0; i3 < i2; i3++) {
            int m373b = this.idleSources.m373b(i3);
            if (AL10.alGetSourcei(m373b, 4105) == i) {
                if (this.sourceToSoundId.m359e(m373b)) {
                    this.soundIdToSource.m344b(((Long) this.sourceToSoundId.m365b(m373b)).longValue());
                }
                AL10.alSourceStop(m373b);
            }
        }
    }

    void pauseSourcesWithBuffer(int i) {
        if (this.noDevice) {
            return;
        }
        int i2 = this.idleSources.f7225b;
        for (int i3 = 0; i3 < i2; i3++) {
            int m373b = this.idleSources.m373b(i3);
            if (AL10.alGetSourcei(m373b, 4105) == i) {
                AL10.alSourcePause(m373b);
            }
        }
    }

    void resumeSourcesWithBuffer(int i) {
        if (this.noDevice) {
            return;
        }
        int i2 = this.idleSources.f7225b;
        for (int i3 = 0; i3 < i2; i3++) {
            int m373b = this.idleSources.m373b(i3);
            if (AL10.alGetSourcei(m373b, 4105) == i && AL10.alGetSourcei(m373b, 4112) == 4115) {
                AL10.alSourcePlay(m373b);
            }
        }
    }

    public void backgroundUpdate() {
        if (this.noDevice) {
            return;
        }
        for (int i = 0; i < this.music.size(); i++) {
            ((OpenALMusic) this.music.get(i)).backgroundUpdate();
        }
    }

    public boolean hasDevice() {
        return this.noDevice;
    }

    public void update() {
        if (this.noDevice) {
            return;
        }
        for (int i = 0; i < this.music.size(); i++) {
            ((OpenALMusic) this.music.get(i)).update();
        }
    }

    public long getSoundId(int i) {
        if (this.sourceToSoundId.m359e(i)) {
            return ((Long) this.sourceToSoundId.m369a(i)).longValue();
        }
        return -1L;
    }

    public void stopSound(long j) {
        if (this.soundIdToSource.m340d(j)) {
            AL10.alSourceStop(((Integer) this.soundIdToSource.m349a(j)).intValue());
        }
    }

    public void pauseSound(long j) {
        if (this.soundIdToSource.m340d(j)) {
            AL10.alSourcePause(((Integer) this.soundIdToSource.m349a(j)).intValue());
        }
    }

    public void resumeSound(long j) {
        if (this.soundIdToSource.m340d(j)) {
            int intValue = ((Integer) this.soundIdToSource.m349a(j)).intValue();
            if (AL10.alGetSourcei(intValue, 4112) == 4115) {
                AL10.alSourcePlay(intValue);
            }
        }
    }

    public void setSoundGain(long j, float f) {
        if (this.soundIdToSource.m340d(j)) {
            AL10.alSourcef(((Integer) this.soundIdToSource.m349a(j)).intValue(), 4106, f);
        }
    }

    public void setSoundLooping(long j, boolean z) {
        if (this.soundIdToSource.m340d(j)) {
            AL10.alSourcei(((Integer) this.soundIdToSource.m349a(j)).intValue(), 4103, z ? 1 : 0);
        }
    }

    public void setSoundPitch(long j, float f) {
        if (this.soundIdToSource.m340d(j)) {
            AL10.alSourcef(((Integer) this.soundIdToSource.m349a(j)).intValue(), 4099, f);
        }
    }

    public void setSoundPan(long j, float f, float f2) {
        if (this.soundIdToSource.m340d(j)) {
            int intValue = ((Integer) this.soundIdToSource.m349a(j)).intValue();
            AL10.alSource3f(intValue, 4100, C1177m.m329b(((f - 1.0f) * 3.1415927f) / 2.0f), 0.0f, C1177m.m332a(((f + 1.0f) * 3.1415927f) / 2.0f));
            AL10.alSourcef(intValue, 4106, f2);
        }
    }

    public void dispose() {
        if (this.noDevice) {
            return;
        }
        int i = this.allSources.f7225b;
        for (int i2 = 0; i2 < i; i2++) {
            int m373b = this.allSources.m373b(i2);
            if (AL10.alGetSourcei(m373b, 4112) != 4116) {
                AL10.alSourceStop(m373b);
            }
            AL10.alDeleteSources(m373b);
        }
        this.sourceToSoundId.m370a();
        this.soundIdToSource.m351a();
        AL.destroy();
        while (AL.isCreated()) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
            }
        }
    }

    @Override // com.corrodinggames.rts.java.audio.Audio
    public AudioDevice newAudioDevice(int i, final boolean z) {
        return this.noDevice ? new AudioDevice() { // from class: com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio.1
            @Override // com.corrodinggames.rts.java.audio.AudioDevice
            public void writeSamples(float[] fArr, int i2, int i3) {
            }

            @Override // com.corrodinggames.rts.java.audio.AudioDevice
            public void writeSamples(short[] sArr, int i2, int i3) {
            }

            @Override // com.corrodinggames.rts.java.audio.AudioDevice
            public void setVolume(float f) {
            }

            @Override // com.corrodinggames.rts.java.audio.AudioDevice
            public boolean isMono() {
                return z;
            }

            @Override // com.corrodinggames.rts.java.audio.AudioDevice
            public int getLatency() {
                return 0;
            }

            @Override // com.corrodinggames.rts.java.audio.AudioDevice
            public void dispose() {
            }
        } : new OpenALAudioDevice(this, i, z, this.deviceBufferSize, this.deviceBufferCount);
    }

    @Override // com.corrodinggames.rts.java.audio.Audio
    public AudioRecorder newAudioRecorder(int i, boolean z) {
        return this.noDevice ? new AudioRecorder() { // from class: com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio.2
            @Override // com.corrodinggames.rts.java.audio.AudioRecorder
            public void read(short[] sArr, int i2, int i3) {
            }

            @Override // com.corrodinggames.rts.java.audio.AudioRecorder
            public void dispose() {
            }
        } : new JavaSoundAudioRecorder(i, z);
    }

    protected void retain(OpenALSound openALSound, boolean z) {
        this.mostRecetSound++;
        this.mostRecetSound %= this.recentSounds.length;
        if (z && this.recentSounds[this.mostRecetSound] != null) {
            this.recentSounds[this.mostRecetSound].stop();
        }
        this.recentSounds[this.mostRecetSound] = openALSound;
    }

    public void forget(OpenALSound openALSound) {
        for (int i = 0; i < this.recentSounds.length; i++) {
            if (this.recentSounds[i] == openALSound) {
                this.recentSounds[i] = null;
            }
        }
    }
}