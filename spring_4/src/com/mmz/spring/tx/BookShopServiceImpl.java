package com.mmz.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
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
    /**
     * 添加事务注解
     * 1.使用 propagation 指定事务的传播行为, 即当前的事务方法被另外一个事务方法调用时如何使用事务,
     *   默认取值为 REQUIRED, 即使用调用方法的事务
     *   REQUIRES_NEW: 事务自己的事务, 调用的事务方法的事务被挂起
     * 2.使用 isolation 指定事务的隔离级别, 最常用的取值为 READ_COMMITTED
     * 3.默认情况下 Spring 的声明式事务对所有的运行时异常进行回滚. 也可以通过对应的属性进行设置. 通常情况下取默认值即可.
     * 4.使用 readOnly 指定事务是否为只读. 表示这个事务只读取数据但不更新数据,这样可以帮助数据库引擎优化事务.
     *   若真的是一个只读取数据库值的方法, 应设置 readOnly=true
     * 5.使用 timeout 指定强制回滚之前事务可以占用的时间
     */
    //添加事务注解
    @Transactional(propagation = Propagation.REQUIRES_NEW)
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
