package Array;
//   Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i]
//   and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//   Specifically, ans is the concatenation of two nums arrays.Return the array ans.


import java.util.Arrays;
import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
       int[] nums= {1,2,3};
            int[] answer =getConcatenation(nums);
            System.out.println(Arrays.toString(answer));
        }

    static int[] getConcatenation(int[] nums) {

        int[] ans = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }


        return ans;
    }
}
