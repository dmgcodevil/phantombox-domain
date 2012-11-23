package com.git.domain.api;

import java.util.Set;

/**
 * Setup interface.
 * <p/>
 * Date: 23.11.12
 * Time: 15:12
 *
 * @author rpleshkov
 */
public interface ISetup {

    /**
     * Gets all audio devices.
     *
     * @return Audio devices
     */
    Set<String> getAudioDevices();

    /**
     * Set audio devices.
     *
     * @param audioDevices audio devices
     */
    void setAudioDevices(Set<String> audioDevices);

    /**
     * Gets all video devices.
     *
     * @return video devices
     */
    Set<String> getVideoDevices();

    /**
     * Sets video devices.
     *
     * @param videoDevices video devices
     */
    void setVideoDevices(Set<String> videoDevices);

    /**
     * Gets current audio device.
     *
     * @return {@link IAudioDevice}
     */
    IAudioDevice getAudioDevice();

    /**
     * Sets current audio device.
     *
     * @param audioDevice {@link IAudioDevice}
     */
    void setAudioDevice(IAudioDevice audioDevice);

    /**
     * Gets video device.
     *
     * @return {@link IVideoDevice}
     */
    IVideoDevice getVideoDevice();

    /**
     * Sets video device.
     *
     * @param videoDevice {@link IVideoDevice}
     */
    void setVideoDevice(IVideoDevice videoDevice);
}
