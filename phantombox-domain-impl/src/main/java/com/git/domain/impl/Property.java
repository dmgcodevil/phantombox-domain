package com.git.domain.impl;

import com.git.domain.api.IProperty;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * {@link IProperty} interface implementation.
 * <p/>
 * User: dmgcodevil
 * Date: 11/18/12
 * Time: 9:51 AM
 */
@Document(collection = "property")
public class Property extends Domain implements IProperty {

    private String gateway;

    private int audioPort;

    private int videoPort;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getGateway() {
        return gateway;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getAudioPort() {
        return audioPort;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setAudioPort(int audioPort) {
        this.audioPort = audioPort;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getVideoPort() {
        return videoPort;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setVideoPort(int videoPort) {
        this.videoPort = videoPort;
    }
}
