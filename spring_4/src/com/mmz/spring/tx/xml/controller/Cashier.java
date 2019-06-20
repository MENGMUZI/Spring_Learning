package com.mmz.spring.tx.xml.controller;

import java.util.List;

public interface Cashier {

    void checkout(String username, List<Integer> bids);

}
