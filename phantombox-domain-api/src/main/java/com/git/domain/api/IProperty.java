package com.git.domain.api;

/**
 * Property interface.
 * <p/>
 * User: dmgcodevil
 * Date: 11/18/12
 * Time: 9:50 AM
 */
public interface IProperty extends IDomain {

    /**
     * Gets gateway.
     *
     * @return ip gateway
     */
    String getGateway();

    /**
     * Sets gateway.
     *
     * @param gateway default gateway
     */
    void setGateway(String gateway);

    /**
     * Gets audio port.
     *
     * @return audio port
     */
    public int getAudioPort();

    /**
     * Sets audio port.
     *
     * @param audioPort audio port
     */
    public void setAudioPort(int audioPort);

    /**
     * Gets video port.
     *
     * @return video port
     */
    public int getVideoPort();

    /**
     * Set video port.
     *
     * @param videoPort video port
     */
    public void setVideoPort(int videoPort);


}
