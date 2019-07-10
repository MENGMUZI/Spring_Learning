package com.mmz.servlet;

import com.mmz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  10:09
 * @description:
 */

@Controller
public class BookServlet {

    @Autowired
    public BookService bookService;

    public void doGet(){

        bookService.save();
    }



}
