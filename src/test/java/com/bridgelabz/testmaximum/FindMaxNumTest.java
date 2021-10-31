package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxNumTest {
    FindMaxNum findMaxNum = new FindMaxNum();
    @Test
    public void givenThreeIntegerNumber_shouldReturn_firstNumberIsMaximum(){
        int result = findMaxNum.findMax(100,50,30);
        Assert.assertEquals(100, result);
    }

    @Test
    public void givenThreeIntegerNumber_shouldReturn_secondNumberIsMaximum(){
        int result = findMaxNum.findMax(50,100,30);
        Assert.assertEquals(100, result);
    }
    @Test
    public void givenThreeIntegerNumber_shouldReturn_thirdNumberIsMaximum(){
        int result = findMaxNum.findMax(30,50,100);
        assertEquals(100, result);
    }

    @Test
    public void givenThreeFloatNumber_shouldReturn_firstNumberIsMaximum(){
        float result = findMaxNum.findMax(10.0F, 5.0F, 3.0F);
        Assert.assertEquals(10.0, result, 0.0);
    }

    @Test
    public void givenThreeFloatNumber_shouldReturn_secondNumberIsMaximum(){
        float result = findMaxNum.findMax(5.0F, 10.0F,3.0F);
        Assert.assertEquals(10.0, result,0.0);
    }
    @Test
    public void givenThreeFloatNumber_shouldReturn_thirdNumberIsMaximum(){
        float result = findMaxNum.findMax(3.0F, 5.0F, 10.0F);
        Assert.assertEquals(10.0, result,0.0);
    }

    @Test
    public void givenThreeStrings_shouldReturn_firstStringIsMaximum(){
        String result = findMaxNum.findMax("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void givenThreeStrings_shouldReturn_secondStringIsMaximum(){
        String result = findMaxNum.findMax("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", result);
    }
    @Test
    public void givenThreeStrings_shouldReturn_thirdStringIsMaximum(){
        String result = findMaxNum.findMax("Banana", "Apple", "Peach");
        Assert.assertEquals("Peach", result);
    }
}