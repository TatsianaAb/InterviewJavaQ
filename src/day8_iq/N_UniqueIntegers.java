package day8_iq;

import java.util.Arrays;
import java.util.Scanner;

/*
Array - N unique integers that sum up to 0
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function
can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -
1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1] (but there are
many more correct answers).
 */
public class N_UniqueIntegers {

    public static int[] sumZero(int num) {
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = i * 2 - num + 1;
            }

            return arr;
    }
    /*
    if num = 6;
    arr[0] = 0*2 - 6+1 = -5
    arr[1] = 1*2 - 6+1 = -3
    arr[2] = 2*2 - 6+1 = -1
    arr[3] = 3*2 - 6+1 = 1
    arr[4] = 4*2 - 6+1 = 3
    arr[5] = 5*2 - 6+1 = 5

    if num = 5
    arr[0] = 0*2 - 5+1 = -4
    arr[1] = 1*2 - 5+1 = -2
    arr[2] = 2*2 - 5+1 = 0
    arr[3] = 3*2 - 5+1 = 2
    arr[4] = 4*2 - 5+1 = 4
     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int num = scan.nextInt();
        while (num <= 0){
            System.err.println("Can not enter negative number or zero! Please enter your number:");
            num = scan.nextInt();
        }
        System.out.println(Arrays.toString(N_UniqueIntegers.sumZero(num)));


    }
}


