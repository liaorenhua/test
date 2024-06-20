package com.leo.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

/**
 * @description:
 * @author: Leo
 * @date: 2024/6/20
 * @param: 
 * @return: 
 * @throws: 
 * @modified by: 
 * @modified description: 
*/
class MyGreeterTest {
    private static MyGreeter myGreeter;

    @BeforeAll
    static void init () {
        myGreeter = new MyGreeter();
    }

    @Test
    void greeting() {
        String result = myGreeter.greeting();
        System.out.println(result);
        try {
            assertEquals("Good afternoon", result);
        } catch (Exception e) {
            System.out.println("Now is not afternoon");
        }
    }
}