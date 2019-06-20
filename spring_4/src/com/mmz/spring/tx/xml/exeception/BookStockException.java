package com.mmz.spring.tx.xml.exeception;

/**
 * @author : mengmuzi
 * create at:  2019-06-20  16:44
 * @description:
 */
public class BookStockException extends RuntimeException{

    public BookStockException() {
        super();
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

    protected BookStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}


