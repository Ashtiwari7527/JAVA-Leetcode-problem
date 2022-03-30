package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int extraCandies= input.nextInt();
        int[] candies = new int[n];
        for(int i=0;i<n;i++){
            candies[i]=input.nextInt();}

            ArrayList<Boolean> answer = (ArrayList<Boolean>) kidsWithCandies(candies,extraCandies);
            System.out.println(answer);

        }



    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        ArrayList<Boolean> largest = new ArrayList(candies.length);
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= max) {
                largest.add(true);
            } else {
                largest.add(false);
            }
        }
        return largest;

    }
}