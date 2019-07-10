package com.mmz.service;

import com.mmz.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  10:09
 * @description:
 */

@Service
public class BookService {

    @Qualifier("bookDao")
    @Autowired
    public BookDao bookDao;

    public void save(){
        System.out.println("bookService is using bookDao........");
        bookDao.saveBook();
    }

}
