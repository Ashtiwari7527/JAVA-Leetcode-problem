//Program to find sum of first n natural numbers

package methods;

import java.util.Scanner;

public class problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
       int answer= sum(n);
        System.out.println(answer);

    }
    static int sum(int n){
        int c=0;

        while(n>0){
             c=c+n;
            n--;
        }

        return c;
    }



}
