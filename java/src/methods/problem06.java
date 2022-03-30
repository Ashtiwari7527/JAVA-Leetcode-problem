
package methods;

import java.util.Scanner;

public class problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
       String answer= grades(marks);
        System.out.println(answer);
    }

    static String grades(int marks) {
        String ans;
        if (marks >= 90) {
            ans = "A";
        }
        else if (marks >= 70 && marks <= 90) {
            ans = "b";
        }
        else if (marks >= 50 && marks <= 70) {
            ans = "c";
        }
        else if (marks >= 33 && marks <= 50) {
            ans = "d";
        }
        else
            ans = "you r fail";

        return ans;
    }
}

