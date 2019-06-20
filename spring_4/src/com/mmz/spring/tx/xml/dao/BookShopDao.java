package com.mmz.spring.tx.xml.dao;

public interface BookShopDao {

    /**
     * 根据书号获取书的单价
     */
    int findBookPriceById(int bid);

    /**
     * 更新数的库存. 使书号对应的库存 - 1
     */
    void updateBookStock(int bsid);

    /**
     * 更新用户的账户余额: 使 username 的 balance - price
     */
    void updateUserAccount(String username, int bprice);

}
