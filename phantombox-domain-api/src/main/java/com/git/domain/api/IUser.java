package com.git.domain.api;

import java.util.Set;

/**
 * User interface.
 * <p/>
 * Date: 15.11.12
 * Time: 19:48
 *
 * @author rpleshkov
 */
public interface IUser extends IDomain {

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
     * Gets password.
     *
     * @return password
     */
    String getPassword();

    /**
     * Sets password.
     *
     * @param password password
     */
    void setPassword(String password);

    /**
     * Gets contacts.
     *
     * @return {@link IContact}
     */
    public IContact getContact();

    /**
     * Sets contacts.
     *
     * @param contact {@link IContact}
     */
    public void setContact(IContact contact);

    /**
     * Gets contacts.
     *
     * @return list of {@link IContact} objects
     */
    Set<IContact> getContacts();


    /**
     * Sets contacts.
     *
     * @param contacts list of {@link IContact} objects
     */
    void setContacts(Set<IContact> contacts);

}
