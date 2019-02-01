package com.course.testng.Parameter;

import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "")
    public void testDataProvider(String name, int age){
        System.out.println("name = [" + name + "], age = [" + age + "]");
    }

    public Object[][] providerData(){
        Object[][] o = new Object[][]
    }
}
