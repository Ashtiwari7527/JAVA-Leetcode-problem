package methods;

import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int add = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;

            add = add + (digit * digit * digit);
            System.out.println(add);
        }
    }
}