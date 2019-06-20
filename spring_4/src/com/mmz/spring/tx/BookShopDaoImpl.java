package com.mmz.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author : mengmuzi
 * create at:  2019-06-20  16:03
 * @description:
 */
@Repository("bookShopDao")
public class BookShopDaoImpl implements BookShopDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public int findBookPriceById(int bid) {
        String sql = "SELECT bprice FROM book WHERE bid = ?";
        return jdbcTemplate.queryForObject(sql,Integer.class,bid);
    }

    @Override
    public void updateBookStock(int bsid) {
        //检查书的库存是否足够, 若不够, 则抛出异常
        String sql2 = "SELECT bstock FROM book_stock WHERE bsid = ?";
        int stock = jdbcTemplate.queryForObject(sql2,Integer.class,bsid);
        if(stock == 0){

            throw new BookStockException("库存不足！");
        }
        String sql = "UPDATE book_stock SET bstock = bstock -1 WHERE bsid = ?";
        jdbcTemplate.update(sql,bsid);
    }

    @Override
    public void updateUserAccount(String username, int bprice) {
        //验证余额是否足够, 若不足, 则抛出异常
        String sql2 = "SELECT balance FROM account WHERE username = ?";
        int balance = jdbcTemplate.queryForObject(sql2, Integer.class, username);
        if (balance < bprice) {
            throw new UserAccountException("余额不足!");
        }
        String sql = "UPDATE account SET balance = balance - ? WHERE username = ?";
        jdbcTemplate.update(sql,bprice,username);
    }
}
