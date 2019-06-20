package com.mmz.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : mengmuzi
 * create at:  2019-06-20  20:18
 * @description:
 */
@Service("cashier")
public class CashierImpl implements Cashier {

    @Autowired
    private BookShopService bookShopService;


    @Transactional
    @Override
    public void checkout(String username, List<Integer> bids) {

        for (Integer bid : bids) {
            bookShopService.purchase(username,bid);
        }

    }
}
