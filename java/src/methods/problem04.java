//Addition Of Two Numbers In Java Using Method

package methods;

import java.util.Scanner;

public class problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number :");
        int a = input.nextInt();
        System.out.println("enter second no.: ");
        int b = input.nextInt();
        int answer = sum(a,b);
        System.out.println("your sum is: "+answer);

    }

    static int sum(int num1 ,int num2 ){
       int  sum = num1+num2;
       return sum;
    }

}