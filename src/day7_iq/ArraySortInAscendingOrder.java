package day7_iq;

import java.util.Arrays;

public class ArraySortInAscendingOrder {

    public static int[] sortArrayInAscendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {//i: 0 i+1: 1
                int temp = array[i];//5
                array[i] = array[i + 1];//3
                array[i + 1] = temp;//5
                i = -1;//resetting i to -1 so that we could go back to beginning of array
            }
        }

        return array;
    }


    public static void main(String[] args) {

        int[] numbers = {10, 9, 8, 7};
        //index:          0  1  2  3
        System.out.println(Arrays.toString(ArraySortInAscendingOrder.sortArrayInAscendingOrder(numbers)));
        //9, 10, 8, 7
        //9, 8, 10, 7
        //8, 9, 10, 7
        //8, 9, 7, 10
        //8, 7, 9, 10
        //7, 8, 9, 10
    }

}
/*
 2) Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
 */
