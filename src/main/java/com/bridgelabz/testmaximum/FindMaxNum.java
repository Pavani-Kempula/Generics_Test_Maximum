package com.bridgelabz.testmaximum;

/*
 * Name : maximumInteger
 *
 * Description : Finding maximum number
 *
 * Algorithm : Finding maximum numbers using generic
 */

public class FindMaxNum<E extends  Comparable<E>> {
    E[] inputArray;
    public FindMaxNum(E[] inputArray) {
        this.inputArray = inputArray;
    }

    public E findMax() {
        E result = findMax(inputArray);
        return result;
    }

    public static <E extends Comparable> E findMax(E[] inputArray) {
        E max = inputArray[0];
        for (E element : inputArray) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        printMaximum(max);
        return max;
    }

    public static <E> void printMaximum(E max){
        System.out.println("Maximum Value is:" + max);
    }
}