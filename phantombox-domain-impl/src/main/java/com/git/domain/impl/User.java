package com.git.domain.impl;

import com.git.domain.api.CascadeSave;
import com.git.domain.api.IContact;
import com.git.domain.api.IUser;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link IUser} interface implementation.
 * <p/>
 * Date: 15.11.12
 * Time: 19:50
 *
 * @author rpleshkov
 */
@Document(collection = "user")
public class User extends Domain implements IUser {

    private String name;

    private String password;

    @DBRef
    private Set<IContact> contacts = new HashSet();

    @DBRef
    @CascadeSave
    private IContact contact;


    /**
     * Default constructor.
     */
    public User() {
    }

    /**
     * @param name     name
     * @param password password
     * @param contact  {@link IContact}
     */
    public User(String name, String password, IContact contact) {
        this.name = name;
        this.password = password;
        this.contact = contact;
    }

    /**
     * Constructor with parameters.
     *
     * @param id       user id
     * @param name     name
     * @param password password
     * @param contacts set of {@link IContact} objects
     * @param contact  {@link IContact}
     */
    @JsonCreator
    public User(@JsonProperty("id") String id,
                @JsonProperty("name") String name,
                @JsonProperty("password") String password,
                @JsonProperty("contacts") Set<IContact> contacts,
                @JsonProperty("contact") IContact contact) {
        setId(id);
        this.name = name;
        this.password = password;
        this.contacts = contacts;
        this.contact = contact;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
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


    /**
     * {@inheritDoc}
     */
    @Override
    public Set<IContact> getContacts() {
        return contacts;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @JsonDeserialize(contentAs = Contact.class)
    public void setContacts(Set<IContact> contacts) {
        this.contacts = contacts;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User that = (User) o;
        return new EqualsBuilder()
            .appendSuper(super.equals(that))
            .append(name, that.name)
            .append(password, that.password)
            .isEquals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder()
            .appendSuper(super.hashCode())
            .append(name)
            .append(password)
            .toHashCode();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("name", name)
            .append("password", password)
            .append("contact", contact)
            .append("contacts", contacts)
            .toString();
    }
}
