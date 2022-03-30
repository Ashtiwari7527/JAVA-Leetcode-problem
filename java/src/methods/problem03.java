//A person can votes if age is greater than or equal to 18.


package methods;

import java.util.Scanner;

public class problem03 {
    public static void main(String[] args) {
        System.out.println("enter your age :");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String answer = vote(a);
        System.out.println(answer);

    }

    static String vote(int age ){
        String ans;
        if ( age >=18){
            ans="you can vote";
        }
        else
            ans="you can not vote";
                    return ans;

}}
