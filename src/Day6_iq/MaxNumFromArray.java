package Day6_iq;

public class MaxNumFromArray {
    /*
    Array - Find Maximum
Write a method that can find the maximum number from an int Array
     */

    public static int maxNum(int[] array){
        int max = array[0];
        for (int each : array) {
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 88, 5, 4, 3};
        System.out.println(MaxNumFromArray.maxNum(nums));




    }



}
