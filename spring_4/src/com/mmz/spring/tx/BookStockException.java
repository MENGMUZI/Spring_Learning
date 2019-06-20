package com.mmz.spring.tx;

/**
 * @author : mengmuzi
 * create at:  2019-06-20  16:44
 * @description:
 */
public class BookStockException extends RuntimeException{

    public BookStockException() {
    }

    public BookStockException(String message) {
        super(message);
    }

    public BookStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookStockException(Throwable cause) {
        super(cause);
    }

    public BookStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
