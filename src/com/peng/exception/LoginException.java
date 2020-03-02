package com.peng.exception;

/**
 * @Auther lovely
 * @Create 2020-02-09 9:34
 * @PACKAGE_NAME IntelliJ IDEA
 * @Description
 */
public class LoginException extends Exception {
    private String message;

    public LoginException() {
        super();
    }

    public LoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginException(String message) {
        super(message);
    }

    public LoginException(Throwable cause) {
        super(cause);
    }
}
