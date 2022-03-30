package condition;

import java.util.Scanner;

public class sum_and_multiply_of_digits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int sum=0;
        int multiply = 1;

        while (num>0){

          int digit=  num%10;
            num=num/10;
            sum=sum+digit;
            multiply = digit * multiply;

        }
        int ans= sum- multiply;
        System.out.println(ans);
    }}