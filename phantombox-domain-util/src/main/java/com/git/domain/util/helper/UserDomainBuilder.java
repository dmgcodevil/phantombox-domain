package com.git.domain.util.helper;

import com.git.domain.api.IConnection;
import com.git.domain.api.IContact;
import com.git.domain.api.IUser;
import com.git.domain.impl.Connection;
import com.git.domain.impl.Contact;
import com.git.domain.impl.User;

/**
 * User domain builder.
 * <p/>
 * User: dmgcodevil
 * Date: 11/24/12
 * Time: 2:44 PM
 */
public class UserDomainBuilder {

    private static final String USER_NAME = "Alex";
    private static final String USER_PASSWORD = "ojg#$f34f#%@~23";
    private static final String OWN_CONTACT_NAME = "alexrav";
    private static final Boolean ONLINE = Boolean.TRUE;
    private static final String CHILD_CONTACT_NAME = "marcus";
    private static final Boolean OFFLINE = Boolean.FALSE;
    private static final String CHILD_IP = "127.0.0.1";
    private static final String OWN_IP = "192.168.1.100";
    private static final String EMAIL = "@site.com";
    private static final int AUDIO_PORT = 5555;
    private static final int VIDEO_PORT = 7777;

    private UserDomainBuilder() {
        throw new AssertionError();
    }

    /**
     * Build own contact.
     *
     * @return {@link com.git.domain.api.IContact}
     */
    public static IContact buildOwnContact() {
        IContact contact = new Contact();
        contact.setName(OWN_CONTACT_NAME);
        contact.setOnline(ONLINE);
        contact.setConnection(buildConnection(OWN_IP));
        contact.setEmail(OWN_CONTACT_NAME + EMAIL);
        return contact;
    }

    /**
     * Build contact.
     *
     * @return {@link IContact}
     */
    public static IContact buildContact() {
        IContact contact = new Contact();
        contact.setName(CHILD_CONTACT_NAME);
        contact.setOnline(OFFLINE);
        contact.setConnection(buildConnection(CHILD_IP));
        contact.setEmail(CHILD_CONTACT_NAME + EMAIL);
        return contact;
    }

    /**
     * Build connection.
     *
     * @param ipAddress ip address
     * @return {@link com.git.domain.api.IConnection}
     */
    public static IConnection buildConnection(String ipAddress) {
        IConnection connection = new Connection();
        connection.setAudioPort(AUDIO_PORT);
        connection.setVideoPort(VIDEO_PORT);
        connection.setIpAddress(ipAddress);
        return connection;
    }

    /**
     * Build user.
     *
     * @return {@link com.git.domain.api.IUser}
     */
    public static IUser buildUser() {
        IUser user = new User();
        user.setName(USER_NAME);
        user.setPassword(USER_PASSWORD);
        user.setContact(buildOwnContact());
        return user;
    }
}
