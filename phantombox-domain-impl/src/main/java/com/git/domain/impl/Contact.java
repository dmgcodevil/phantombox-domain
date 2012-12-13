package com.git.domain.impl;

import com.git.domain.api.IConnection;
import com.git.domain.api.IContact;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * {@link IContact} interface implementation.
 * <p/>
 * User: dmgcodevil
 * Date: 11/12/12
 * Time: 4:39 PM
 */
@Document(collection = "contact")
@XmlRootElement(name = "contact")
public class Contact extends Domain implements IContact {

    private String name;

    private boolean online;

    private String email;

    //@DBRef
    //@CascadeSave
    private IConnection connection;

    /**
     * Default constructor.
     */
    public Contact() {
    }

    /**
     * Constructor with parameters.
     *
     * @param name  name
     * @param email email
     */
    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Constructor with parameters. For JSON transformation.
     *
     * @param id         id
     * @param name       name
     * @param online     on line
     * @param email      email
     * @param connection {@link IConnection}
     */
    @JsonCreator
    public Contact(@JsonProperty("id") String id,
                   @JsonProperty("name") String name,
                   @JsonProperty("online") boolean online,
                   @JsonProperty("email") String email,
                   @JsonProperty("connection") IConnection connection) {
        setId(id);
        this.name = name;
        this.online = online;
        this.email = email;
        this.connection = connection;
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
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isOnline() {
        return online;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    @XmlElement
    public void setOnline(boolean online) {
        this.online = online;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IConnection getConnection() {
        return connection;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @XmlElement(name = "connection")
    @JsonDeserialize(as = Connection.class)
    public void setConnection(IConnection connection) {
        this.connection = connection;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Contact)) {
            return false;
        }

        Contact that = (Contact) o;
        return new EqualsBuilder()
            .appendSuper(super.equals(that))
            .append(name, that.name)
            .append(email, that.email)
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
            .append(email)
            .toHashCode();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("name", name)
            .append("email", email)
            .append("online", online)
            .append("connection", connection)
            .toString();
    }
}
