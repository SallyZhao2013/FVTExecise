package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//测试套件之前需要运行的，写共有的东西
public class SuiteConfig {

    @BeforeSuite
    public void beforesuite(){
        System.out.println("before suite运行啦");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite运行啦");
    }

    @BeforeTest
    public void test(){
        System.out.println("beforetest");
    }

    @AfterTest
    public void aftertest(){
        System.out.println("aftertest");
    }
}
