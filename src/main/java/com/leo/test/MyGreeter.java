package com.leo.test;

import java.util.Calendar;

/**
 * @author: Leo
 * @description: 考试题
 * @date: 2024/6/19
 * @modified by:
 * @modified description:
 */
public class MyGreeter {

    public static void main(String[] args) {
        MyGreeter myGreeter = new MyGreeter();
        System.out.println(myGreeter.greeting());
    }

    /**
     * @description: Can return different message strings based on different runtime
     * @author: Leo
     * @date: 2024/6/19
     * @param:
     * @return: 当运行时间在6AM至12AM之间返回"Good morning";12AM至6PM之间返回"Good afternoon";6PM至第二天6AM之间返回"Good evening"
     * @throws:
     * @modified by:
     * @modified description:
    */
    public String greeting () {
        Calendar calendar = Calendar.getInstance();
        int h = calendar.get(Calendar.HOUR_OF_DAY);
        // Can return different message strings based on different runtime
        if (h > 6 && h <= 12) {
            return "Good morning";
        }
        if (h > 12 && h <= 18) {
            return "Good afternoon";
        }
        return "Good evening";
    }
}
