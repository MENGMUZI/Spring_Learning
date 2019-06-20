package com.mmz.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : mengmuzi
 * create at:  2019-06-20  16:49
 * @description:
 */

@Service("bookShopService")
public class BookShopServiceImpl implements BookShopService{

    @Autowired
    private BookShopDao bookShopDao;

    //添加事务注解
    @Transactional
    @Override
    public void purchase(String username, int bid) {

        //1. 获取书的单价
        int bprice = bookShopDao.findBookPriceById(bid);

        //2. 更新书的库存
        bookShopDao.updateBookStock(bid);

        //3. 更新用户的余额
        bookShopDao.updateUserAccount(username,bprice);

    }
}
