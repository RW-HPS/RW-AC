package com.corrodinggames.rts.java.audio;

import com.corrodinggames.rts.java.audio.p051a.C1165a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/Audio.class */
public interface Audio {
    AudioDevice newAudioDevice(int i, boolean z);

    AudioRecorder newAudioRecorder(int i, boolean z);

    Sound newSound(C1165a c1165a);

    Music newMusic(C1165a c1165a);
}