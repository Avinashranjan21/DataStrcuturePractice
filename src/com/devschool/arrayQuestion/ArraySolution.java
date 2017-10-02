package com.devschool.arrayQuestion;

import java.util.Arrays;

/**
 * Created by avinash.ranjan on 02/10/17.
 */
public class ArraySolution {

/*
        Given an array A[], write a function that segregates even and odd numbers.
        The functions should put all even numbers first, and then odd numbers.
        Input  = {12, 34, 45, 9, 8, 90, 3}
        Output = {12, 34, 8, 90, 45, 9, 3}
 */

   public static int[] segregateEvenOdd(int arr[])
    {
        int left = 0, right = arr.length - 1;
        while (left < right)
        {
            while (arr[left]%2 == 0 && left < right)
                left++;

            while (arr[right]%2 == 1 && left < right)
                right--;

            if (left < right)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }
}
