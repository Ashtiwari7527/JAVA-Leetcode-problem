package condition;

import java.util.Scanner;

public class sumofNno {
    public static void main(String[] args) {
        int count = 1;
        Scanner input= new Scanner(System.in);
        int sum=0;
        int n= input.nextInt();

        while (count<=n){
            System.out.println("enter"+count+"st no.");
            int num=input.nextInt();
            sum= sum+num;

            count++;
        }
        int avg = sum/n;
        System.out.println("your answer is : "+avg);

    }
}
