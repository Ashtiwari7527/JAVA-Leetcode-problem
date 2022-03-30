package condition;

import java.util.Scanner;

public class fibonacci_no {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n= input.nextInt();
        int a= 0;
        int b= 1;
        int count=2;

        while(count<=n){

            int temp =b ;
            b=a+b;
            a=temp;
            count++;

        }
        System.out.println("ur fibonacci no. is : "+ b);
    }
}

