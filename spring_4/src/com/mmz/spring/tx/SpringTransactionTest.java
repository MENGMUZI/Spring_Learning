package com.mmz.spring.tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author : mengmuzi
 * create at:  2019-06-20  16:21
 * @description:
 */
public class SpringTransactionTest {

    private ApplicationContext ctx = null;
    private BookShopDao bookShopDao = null;
    private BookShopService bookShopService = null;
    private Cashier cashier = null;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContext-tx.xml");
        bookShopDao = ctx.getBean(BookShopDao.class);
        bookShopService = ctx.getBean(BookShopService.class);
        cashier = ctx.getBean(Cashier.class);
    }

    @Test
    public void testBookShopDaoFindPriceById(){
        System.out.println(bookShopDao.findBookPriceById(1001));
    }

    @Test
    public void testBookShopDaoUpdateBookStock() {
        bookShopDao.updateBookStock(1001);
    }

    @Test
    public void testBookShopDaoUpdateUserAccount() {
        bookShopDao.updateUserAccount("AA", 10);
    }

    @Test
    public void testBookShopService(){
        bookShopService.purchase("AA",1002);
    }

    @Test
    public void testTransacationalPropagation(){
        cashier.checkout("AA", Arrays.asList(1001,1002));
    }




}
