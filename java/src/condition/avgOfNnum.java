package condition;

import java.util.Scanner;

public class avgOfNnum {
    public static void main(String[] args) {
        int count = 1;
        Scanner input = new Scanner(System.in);
        int max = 0;
        int n = input.nextInt();

        while (count <= n) {
            System.out.println("enter " + count + " st no.");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            } else
                max = max;


            count++;
        }
        System.out.println(max);
    }
}