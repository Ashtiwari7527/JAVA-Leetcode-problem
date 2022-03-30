package Array;

//     Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]]
//     for each 0 <= i < nums.length and return it.
//     A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

import java.util.Arrays;
import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
       int[] answer = buildArray(nums);
        System.out.println(Arrays.toString(answer));

    }
    public static int[] buildArray(int[] nums) {


        int[] ans = new int[nums.length];

        for (int i = 0; i <ans.length; i++) {
            ans[i] = nums[nums[i]];


        }
        return ans;
    }

}
