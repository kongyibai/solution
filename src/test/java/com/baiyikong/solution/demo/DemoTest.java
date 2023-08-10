package com.baiyikong.solution.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    public void test_add() {
        Demo demo = new Demo();
        int result = demo.add(5, 6);

        Assert.assertEquals("该加法方法出错了",result,11);
    }
}