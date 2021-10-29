package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxNumTest {
    FindMaxNum findMaxNum = new FindMaxNum();
    @Test
    public void givenThreeIntegerNumber_shouldReturn_firstNumberIsMaximum(){
        int result = findMaxNum.findMaxIntNumber(100,50,30);
        Assert.assertEquals(100, result);
    }

    @Test
    public void givenThreeIntegerNumber_shouldReturn_secondNumberIsMaximum(){
        int result = findMaxNum.findMaxIntNumber(50,100,30);
        Assert.assertEquals(100, result);
    }
    @Test
    public void givenThreeIntegerNumber_shouldReturn_thirdNumberIsMaximum(){
        int result = findMaxNum.findMaxIntNumber(30,50,100);
        Assert.assertEquals(100, result);
    }
    @Test
    public void givenThreeFloatNumber_shouldReturn_firstNumberIsMaximum(){
        float result = findMaxNum.findMaxFloatNumber(10.0F, 5.0F, 3.0F);
        Assert.assertEquals(10.0, result, 0.0);
    }

    @Test
    public void givenThreeFloatNumber_shouldReturn_secondNumberIsMaximum(){
        float result = findMaxNum.findMaxFloatNumber(5.0F, 10.0F,3.0F);
        Assert.assertEquals(10.0, result,0.0);
    }
    @Test
    public void givenThreeFloatNumber_shouldReturn_thirdNumberIsMaximum(){
        float result = findMaxNum.findMaxFloatNumber(3.0F, 5.0F, 10.0F);
        Assert.assertEquals(10.0, result,0.0);
    }
}