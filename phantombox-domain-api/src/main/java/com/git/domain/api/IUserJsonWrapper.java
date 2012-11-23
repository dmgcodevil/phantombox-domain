package com.git.domain.api;

/**
 * User json wrapper interface. This wrapper contains instance of {@link IUser} object.
 * Rest call return data in json format.
 * <p/>
 * User: dmgcodevil
 * Date: 11/18/12
 * Time: 7:30 PM
 */
public interface IUserJsonWrapper {

    /**
     * Gets user.
     *
     * @return {@link IUser}
     */
    public IUser getUser();

    /**
     * Sets user.
     *
     * @param user {@link IUser}
     */
    public void setUser(IUser user);
}
