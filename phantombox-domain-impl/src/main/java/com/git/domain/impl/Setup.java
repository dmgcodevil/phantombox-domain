package com.git.domain.impl;

import com.git.domain.api.IDevice;
import com.git.domain.api.ISetup;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * {@link ISetup} interface implementation.
 * <p/>
 * User: dmgcodevil
 * Date: 11/11/12
 * Time: 8:29 AM
 */
@XmlRootElement
public class Setup implements ISetup {

    private IDevice audioDevice = new Device();

    private IDevice videoDevice = new Device();


    /**
     * Default constructor.
     */
    public Setup() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IDevice getAudioDevice() {
        return audioDevice;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @XmlElement(type = Device.class)
    public void setAudioDevice(IDevice audioDevice) {
        this.audioDevice = audioDevice;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IDevice getVideoDevice() {
        return videoDevice;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @XmlElement(type = Device.class)
    public void setVideoDevice(IDevice videoDevice) {
        this.videoDevice = videoDevice;
    }
}
