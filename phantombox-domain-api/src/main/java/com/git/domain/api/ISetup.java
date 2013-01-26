package com.git.domain.api;

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
     * Gets current audio device.
     *
     * @return {@link IDevice}
     */
    IDevice getAudioDevice();

    /**
     * Sets current audio device.
     *
     * @param audioDevice {@link IDevice}
     */
    void setAudioDevice(IDevice audioDevice);

    /**
     * Gets video device.
     *
     * @return {@link IDevice}
     */
    IDevice getVideoDevice();

    /**
     * Sets video device.
     *
     * @param videoDevice {@link IDevice}
     */
    void setVideoDevice(IDevice videoDevice);
}
