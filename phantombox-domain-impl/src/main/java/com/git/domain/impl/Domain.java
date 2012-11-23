package com.git.domain.impl;

import com.git.domain.api.IDomain;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * {@link IDomain} interface implementation.
 * <p/>
 * Date: 27.09.12
 * Time: 13:17
 *
 * @author rpleshkov
 */

public class Domain implements IDomain, Serializable {

    @Id
    private String id;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    public void setId(String id) {
        this.id = id;
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

        Domain that = (Domain) o;
        return new EqualsBuilder()
            .append(id, that.id)
            .isEquals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder()
            .append(id)
            .toHashCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", id)
            .toString();
    }
}