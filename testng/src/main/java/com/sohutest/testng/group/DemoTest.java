package com.sohutest.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class DemoTest {

    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端测试11111。。。");
    }

    @Test(groups = "client")
    public void test2(){
        System.out.println("客户端测试22222。。。");
    }

    @BeforeGroups("server")
    public void beforeGroupTest(){
        System.out.println("服务端组运行前执行");
    }

    @AfterGroups("server")
    public void afterGroup(){
        System.out.println("服务端组运行后的执行");
    }
}
