package com.github.xrozl.vocall.account;

import com.github.xrozl.vocall.StrUtils;

import java.util.logging.Logger;

public class AccountManager {

    private static AccountManager instance;
    private boolean isLoggedIn;

    public AccountManager() {
        isLoggedIn = false;
        Logger.getLogger(StrUtils.getLogger("AccountManager")).info("AccountManager created");
    }

    public static AccountManager getInstance() {
        if (instance == null) {
            instance = new AccountManager();
        }
        return instance;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}
