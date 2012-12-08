package com.git.domain.api;

/**
 * Contact json wrapper interface. This wrapper contains instance of {@link IContact} object.
 * Rest call return data in json format.
 * <p/>
 * User: dmgcodevil
 * Date: 12/8/12
 * Time: 9:42 AM
 */
public interface IContactJsonWrapper {


    /**
     * Gets contact.
     *
     * @return contact
     */
    IContact getContact();


    /**
     * Sets contact.
     *
     * @param contact {@link IContact}
     */
    void setContact(IContact contact);
}
