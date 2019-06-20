package com.mmz.spring.tx;

import java.util.List;

public interface Cashier {

    void checkout(String username , List<Integer> bids);

}
