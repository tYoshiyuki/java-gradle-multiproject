package com.sample.app.web;

import com.sample.common.mainlib.GreetUtil;
import com.sample.common.sublib.SubGreetUtil;

public class Main {
    public static void main(String[] args) {
        GreetUtil.greeting();
        SubGreetUtil.greeting();
        System.out.println("Hello web");
    }
}
