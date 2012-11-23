package com.git.domain.api;

/**
 * Contact interface.
 * <p/>
 * Date: 15.11.12
 * Time: 18:39
 *
 * @author rpleshkov
 */
public interface IContact extends IDomain {

    /**
     * Gets name.
     *
     * @return the name String
     */
    String getName();

    /**
     * Sets name.
     *
     * @param name String the name to set
     */
    void setName(String name);

    /**
     * Is online.
     *
     * @return is online
     */
    public boolean isOnline();

    /**
     * Sets online status.
     *
     * @param online online
     */
    public void setOnline(boolean online);

    /**
     * Gets email.
     *
     * @return email
     */
    public String getEmail();

    /**
     * Sets email.
     *
     * @param email email
     */
    public void setEmail(String email);

    /**
     * Get connection.
     *
     * @return {@link IConnection}
     */
    IConnection getConnection();

    /**
     * Set connection.
     *
     * @param connection {@link IConnection}
     */
    void setConnection(IConnection connection);

}
