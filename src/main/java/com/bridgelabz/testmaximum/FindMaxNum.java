package com.bridgelabz.testmaximum;

public class FindMaxNum {
    /*
     * Name : maximumInteger
	 *
	 * Description : Finding maximum number
	 *
	 * Algorithm : Finding max integer using compareTo() method
     */
    public <E extends Comparable> E findMax(E num1, E num2, E num3) {
        E maxNumber = num1;
        if (num2.compareTo(maxNumber) > 0){
            maxNumber = num2;
        }
        if (num3.compareTo(maxNumber) > 0){
            maxNumber = num3;
        }
        return maxNumber;
    }

}
