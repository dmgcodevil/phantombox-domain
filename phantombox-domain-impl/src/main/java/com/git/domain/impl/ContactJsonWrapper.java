package com.git.domain.impl;

import com.git.domain.api.IContact;
import com.git.domain.api.IContactJsonWrapper;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

/**
 * {@link IContactJsonWrapper} interface implementation.
 * <p/>
 * User: dmgcodevil
 * Date: 12/8/12
 * Time: 9:43 AM
 */
public class ContactJsonWrapper implements IContactJsonWrapper {

    private IContact contact;

    /**
     * Constructor.
     *
     * @param contact {@link IContact}
     */
    @JsonCreator
    public ContactJsonWrapper(@JsonProperty("contact") IContact contact) {
        this.contact = contact;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IContact getContact() {
        return contact;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @JsonDeserialize(as = Contact.class)
    public void setContact(IContact contact) {
        this.contact = contact;
    }
}
