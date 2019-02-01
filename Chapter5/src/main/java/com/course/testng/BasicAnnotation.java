package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testcase1(){
        System.out.println("Test这是测试用例1");
    }

    @Test
    public void testcase2(){
        System.out.println("Test这是测试用例2");
    }
    @BeforeMethod
    public void beforemethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("beforeclass");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("afterclass");
    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite");
    }
}
