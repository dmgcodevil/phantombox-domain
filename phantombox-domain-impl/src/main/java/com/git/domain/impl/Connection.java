package com.git.domain.impl;

import com.git.domain.api.IConnection;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * {@link IConnection} interface implementation.
 * <p/>
 * User: dmgcodevil
 * Date: 11/12/12
 * Time: 4:39 PM
 */
@Document(collection = "connection")
@XmlRootElement(name = "connection")
public class Connection extends Domain implements IConnection {

    private int audioPort;

    private int videoPort;

    private String ipAddress;

    private Date connected;

    /**
     * Default constructor.
     */
    public Connection() {
    }

    /**
     * Constructor with parameters.
     *
     * @param id        id
     * @param audioPort audio port
     * @param videoPort video port
     * @param ipAddress ip address
     * @param connected date of connection
     */
    @JsonCreator
    public Connection(
        @JsonProperty("id") String id,
        @JsonProperty("audioPort") int audioPort,
        @JsonProperty("videoPort") int videoPort,
        @JsonProperty("ipAddress") String ipAddress,
        @JsonProperty("connected") Date connected) {
        setId(id);
        this.audioPort = audioPort;
        this.videoPort = videoPort;
        this.ipAddress = ipAddress;
        this.connected = connected;
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
    @XmlElement
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
    @XmlElement
    public void setVideoPort(int videoPort) {
        this.videoPort = videoPort;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @XmlElement
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date getConnected() {
        return connected;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @XmlElement
    public void setConnected(Date connected) {
        this.connected = connected;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Domain)) {
            return false;
        }

        Connection that = (Connection) o;
        return new EqualsBuilder()
            .appendSuper(super.equals(o))
            .append(ipAddress, that.ipAddress)
            .isEquals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder()
            .append(ipAddress)
            .toHashCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("ipAddress", ipAddress)
            .append("audioPort", audioPort)
            .append("videoPort", videoPort)
            .toString();
    }
}
