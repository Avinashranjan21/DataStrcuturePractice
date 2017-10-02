package com.devschool.arrayQuestion;

import java.util.Arrays;

/**
 * Created by avinash.ranjan on 02/10/17.
 */
public class ArrayMain {

    public static void main(String[] args) {

//        Calling sorting an array to even first
//        ArraySolution.SortEvenFirst();

        int a[] = {12, 34, 45, 9, 8, 90, 3};
        a = ArraySolution.segregateEvenOdd(a);
        System.out.println("a = " + Arrays.toString(a));
    }
}
