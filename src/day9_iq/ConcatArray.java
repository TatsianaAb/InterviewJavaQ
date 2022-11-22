package day9_iq;

import java.util.Arrays;

public class ConcatArray {


    public static int [] concatTwoArrays(int[] arr1, int[] arr2){
        int size = arr1.length + arr2.length;
        int[] result = new int[size];
        int i = 0;
        for (int each : arr1) {
            result[i] = each;
            i++;
        }
        for(int each : arr2){
            result[i] = each;
            i++;
        }
        return result;
    }


    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(ConcatArray.concatTwoArrays(arr1, arr2)));



    }



}
/*
Array - Concat two arrays
Write a return method that can concate two arrays

 */