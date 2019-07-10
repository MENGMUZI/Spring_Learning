package com.mmz.dao;

import com.mmz.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  10:09
 * @description:
 */

@Repository
public class BookDao extends BaseDao<Book> {

    @Autowired
    @Override
    public void save() {
        System.out.println("save a book.........");
    }
}
