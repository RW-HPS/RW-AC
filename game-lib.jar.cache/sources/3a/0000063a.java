package com.corrodinggames.rts.java.audio;

import com.corrodinggames.rts.java.audio.a.a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/Audio.class */
public interface Audio {
    AudioDevice newAudioDevice(int i, boolean z);

    AudioRecorder newAudioRecorder(int i, boolean z);

    Sound newSound(a aVar);

    Music newMusic(a aVar);
}