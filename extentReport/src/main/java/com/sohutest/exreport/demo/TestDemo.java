package com.sohutest.exreport.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test3(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void logDemo(){
        Reporter.log("自己的log");
        throw  new RuntimeException("自己的异常");
    }


}
