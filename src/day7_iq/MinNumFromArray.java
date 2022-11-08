package day7_iq;

public class MinNumFromArray {
     /*
      1) Array - Find Minimum
Write a method that can find the minimum number from an int Array
     */


    public static int minimumNum(int[] array){
        int min = array[0];
        for (int each : array) {
            if (each < min){
                min = each;
            }
        }
        return min;
    }


    public static void main(String[] args) {

        int[] array = {1, 2, 3, -9, -555, 4, 9, 0};

        System.out.println(MinNumFromArray.minimumNum(array));


    }


}
