//Java Program to Check if a Given Integer is Odd or Even

package methods;

import java.util.Scanner;

public class problem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String ans=   oddeven(a);
        System.out.println(ans);


    }

    static String oddeven(int a){
        String answer;
        if(a%2==0){
            answer= "even";
        }
        else
            answer = "odd";

        return answer;


    }
}
