package com.git.domain.impl;

import com.git.domain.api.IUser;
import com.git.domain.api.IUserJsonWrapper;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

/**
 * {@link IUserJsonWrapper} interface implementation.
 * <p/>
 * User: dmgcodevil
 * Date: 11/18/12
 * Time: 7:31 PM
 */
public class UserJsonWrapper implements IUserJsonWrapper {

    private IUser user;

    /**
     * Constructor.
     *
     * @param user {@link IUser}
     */
    @JsonCreator
    public UserJsonWrapper(@JsonProperty("user") IUser user) {
        this.user = user;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IUser getUser() {
        return user;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @JsonDeserialize(as = User.class)
    public void setUser(IUser user) {
        this.user = user;
    }
}
