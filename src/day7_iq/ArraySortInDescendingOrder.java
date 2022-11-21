package day7_iq;

import java.util.Arrays;

public class ArraySortInDescendingOrder {

    public static int[] sortArrayInDescendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {//i: -1 i++ makes i = 0 at the next step
            if (array[i] < array[i + 1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                i = -1;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 7, 8, 90};
        //index:       0  1  2  3  4
        System.out.println(Arrays.toString(ArraySortInDescendingOrder.sortArrayInDescendingOrder(array)));
        //20, 10, 7, 8, 90
        //20, 10, 8, 7, 90
        //20, 10, 8, 90, 7
        //20, 10, 90, 8, 7
        //20, 90, 10, 8, 7
        //90, 20, 10, 8, 7

    }

}
/*
3) Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
 */

