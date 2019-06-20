package com.mmz.spring.tx.xml.exeception;

/**
 * @author : mengmuzi
 * create at:  2019-06-20  16:45
 * @description:
 */
public class UserAccountException extends RuntimeException {

    public UserAccountException() {
    }

    public UserAccountException(String message) {
        super(message);
    }

    public UserAccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAccountException(Throwable cause) {
        super(cause);
    }

    public UserAccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
