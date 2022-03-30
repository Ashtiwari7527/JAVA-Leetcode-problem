//Java Program to calculate area and circumference of circle

package methods;

import java.util.Scanner;

public class problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        double answer = circumference(a);
        System.out.println("your circumference is :"+answer);

        int b = input.nextInt();
        double answer2 = area(b);
        System.out.println("your area is :"+answer2);


    }

    static double circumference(double rad) {
        double circumference = (rad * 2 * 3.14);


        return circumference;


    }

    static double area(int rad) {

        double area2 = 3.14 * rad * rad;

        return area2;
    }
}