package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxNumTest {
    FindMaxNum findMaxNum = new FindMaxNum();
    @Test
    public void givenThreeIntegerNumber_shouldReturn_firstNumberIsMaximum(){
        int result = findMaxNum.findMaxNumber(100,50,30);
        Assert.assertEquals(100, result);
    }

    @Test
    public void givenThreeIntegerNumber_shouldReturn_secondNumberIsMaximum(){
        int result = findMaxNum.findMaxNumber(50,100,30);
        Assert.assertEquals(100, result);
    }
    @Test
    public void givenThreeIntegerNumber_shouldReturn_thirdNumberIsMaximum(){
        int result = findMaxNum.findMaxNumber(30,50,100);
        Assert.assertEquals(100, result);
    }
}