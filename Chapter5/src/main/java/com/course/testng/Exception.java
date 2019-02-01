package com.course.testng;

import org.testng.annotations.Test;

public class Exception {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("exception failed");
        throw new RuntimeException();

    }
}


