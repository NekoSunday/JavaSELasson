package com.sunday.staticProxy;

import org.junit.Test;

public class demo {
    @Test
    public void test01(){
        UserBoost boost = new UserBoost(new UserService());
        boost.select();

    }
}
