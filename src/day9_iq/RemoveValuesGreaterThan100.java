package day9_iq;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RemoveValuesGreaterThan100 {

    public static List<Integer> removeIfGreaterThan100(List<Integer> list){
        list.removeIf(p -> p > 100);
        return list;
    }


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        for (int i = 90; i <= 150; i++) {
            nums.add(i);
        }

        System.out.println(nums);
        System.out.println(RemoveValuesGreaterThan100.removeIfGreaterThan100(nums));




    }
}
/*
ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */