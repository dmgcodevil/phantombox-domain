package com.git.domain.api;

import java.util.Date;

/**
 * Connection interface.
 * <p/>
 * Date: 15.11.12
 * Time: 18:40
 *
 * @author rpleshkov
 */
public interface IConnection extends IDomain {

    /**
     * Gets audio port.
     *
     * @return audio port
     */
    int getAudioPort();

    /**
     * Sets audio port.
     *
     * @param audioPort audio port
     */
    void setAudioPort(int audioPort);

    /**
     * Gets video port.
     *
     * @return video port
     */
    int getVideoPort();

    /**
     * Set video port.
     *
     * @param videoPort video port
     */
    void setVideoPort(int videoPort);

    /**
     * Gets ip address.
     *
     * @return ip address
     */
    String getIpAddress();

    /**
     * Sets ip address.
     *
     * @param ipAddress ip address
     */
    void setIpAddress(String ipAddress);


    /**
     * Gets connected.
     *
     * @return date and time then connection was created.
     */
    Date getConnected();


    /**
     * Sets connected.
     *
     * @param connected date and time then connection was created
     */
    void setConnected(Date connected);
}
