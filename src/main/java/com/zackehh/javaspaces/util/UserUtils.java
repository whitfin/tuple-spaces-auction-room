package com.zackehh.javaspaces.util;

import com.zackehh.javaspaces.auction.IWsUser;

/**
 * An extremely simple class to store and keep track of the
 * username of the current user. This class will only contain
 * a getter and setter for `username`, and everything should
 * be accessed statically.
 */
public final class UserUtils {

    /**
     * The username of the current registered user. This should
     * not change throughout the lifecycle of the application,
     * however this is provided so we have the potential to.
     */
    private static IWsUser user;

    /**
     * Default constructor which should not be called. All variables
     * and properties should be accessed statically.
     */
    private UserUtils(){
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the current username associated with the application.
     * This should never be null, but it's not guaranteed.
     *
     * @return String       the current username
     */
    public static IWsUser getCurrentUser(){
        return user;
    }

    /**
     * Sets the current username associated with the application. This
     * is called only after the initialization in IWsAuctionRoom#main.
     *
     * @param username      the username to set
     */
    public static IWsUser setCurrentUser(String username){
        user = new IWsUser(username);
        System.out.println("Registered client for user: " + username);
        return user;
    }

}
