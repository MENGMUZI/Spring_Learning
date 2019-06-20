package com.mmz.spring.tx.xml.controller;

import com.mmz.spring.tx.xml.service.BookShopService;

import java.util.List;

/**
 * @author : mengmuzi
 * create at:  2019-06-20  20:18
 * @description:
 */

public class CashierImpl implements Cashier {


    private BookShopService bookShopService;

    public void setBookShopService(BookShopService bookShopService){
        this.bookShopService = bookShopService;
    }

    @Override
    public void checkout(String username, List<Integer> bids) {

        for (Integer bid : bids) {
            bookShopService.purchase(username,bid);
        }

    }
}
