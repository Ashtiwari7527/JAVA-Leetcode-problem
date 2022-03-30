
// Write a Program to find the Maximum and Minimum of the Given Three Numbers

package methods;

import java.util.Scanner;

public class problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int answer = maxmin(num1, num2, num3);
        System.out.println((answer));

    }

    static int maxmin(int num1, int num2, int num3) {
        int max = 0;
        if (num1 > num2 ) {
            max = num1;
        }
        else
            max= num2;

        if (max>num3){
            max=max;
        }
        else
            max=num3;

        return max;
    }
}