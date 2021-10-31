package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxNumTest {
    @Test
    public void givenArraySizeOfFive_shouldReturn_MaximumInteger(){
        Integer[] inputArray = { 2, 4, 6, 8, 10 };
        int finalResult = FindMaxNum.findMax(inputArray);
        Assert.assertEquals(10, finalResult);
    }

    @Test
    public void givenArraySizeOfFour_shouldReturn_MaximumInteger(){
        Integer[] inputArray = { 48, 56, 64, 72 };
        int finalResult = FindMaxNum.findMax(inputArray);
        Assert.assertEquals(72, finalResult);
    }
    @Test
    public void givenArraySizeOfSix_shouldReturn_MaximumInteger(){
        Integer[] inputArray = { 104, 116, 172, 260, 289, 332 };
        int finalResult = FindMaxNum.findMax(inputArray);
        Assert.assertEquals(332, finalResult);
    }

    @Test
    public void givenArraySizeOfFour_shouldReturn_MaximumFloat(){
        Float[] inputArray = { 4.48F, 5.06F, 6.24F, 7.72F };
        float finalResult = FindMaxNum.findMax(inputArray);
        Assert.assertEquals(7.72F, finalResult, 0.0);
    }

    @Test
    public void givenArraySizeOfFive_shouldReturn_MaximumFloat(){
        Float[] inputArray = { 22.3F, 43.5F, 56.2F, 63.2F, 72.64F };
        float finalResult = FindMaxNum.findMax(inputArray);
        Assert.assertEquals(72.64F, finalResult, 0.0);
    }
    @Test
    public void givenArraySizeOfSix_shouldReturn_MaximumFloat(){
        Float[] inputArray = { 132.2F, 162.3F, 624.2F, 712.4F, 816.01F, 916.6F };
        float finalResult = FindMaxNum.findMax(inputArray);
        Assert.assertEquals(916.6F, finalResult, 0.0);
    }

    @Test
    public void givenArraySizeOfFour_shouldReturn_MaximumString(){
        String [] inputArray = { "Peach", "Apple", "Banana", "Mango" };
        String finalResult = FindMaxNum.findMax(inputArray);
        Assert.assertEquals("Peach", finalResult);
    }
    @Test
    public void givenArraySizeOfFive_shouldReturn_MaximumString(){
        String [] inputArray = { "Peach", "Apple", "Banana", "Mango", "Grape" };
        String finalResult = FindMaxNum.findMax(inputArray);
        Assert.assertEquals("Peach", finalResult);
    }
    @Test
    public void givenArraySizeOfSix_shouldReturn_MaximumString(){
        String [] inputArray = { "Peach", "Apple", "Banana", "Mango", "Grape", "Strawberry" };
        String finalResult = FindMaxNum.findMax(inputArray);
        Assert.assertEquals("Strawberry", finalResult);
    }
}