package methods;

import java.util.Scanner;

public class returnst {
    public static void main(String[] args) {
        int answer =sum();
        System.out.println(answer );

    }

    static int sum(){

        Scanner input= new Scanner(System.in);
        System.out.println("enter num1 : ");
        int num1= input.nextInt();
        System.out.println("enter num2 : ");
        int  num2= input.nextInt();
        int ans=num1+num2;

        return ans;

    }
}
