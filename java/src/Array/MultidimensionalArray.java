package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {

            for (int i = 0; i < arr[row].length; i++) {
                arr[row][i] = input.nextInt();


            }

            System.out.println(Arrays.toString(arr[row]));

        }


    }
}