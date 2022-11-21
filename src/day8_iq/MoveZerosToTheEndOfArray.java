package day8_iq;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToTheEndOfArray {
    /*
    Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static int[] moveAllZerosToEnd(int[] arr){
        int [] result = new int[arr.length];
        int i = 0;
        for (int each : arr) {
            if(each != 0){
                result[i] = each;
                i++;
            }

        }
        return result;
    }

    public static void main(String[] args) {


        int[] array = {1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(MoveZerosToTheEndOfArray.moveAllZerosToEnd(array)));

        int[] array2 = {1,0,2,0,3,0,4,0,5,0,6,0,7,0,8,0,9,0,10};
        System.out.println(Arrays.toString(MoveZerosToTheEndOfArray.moveAllZerosToEnd(array2)));



    }

}
