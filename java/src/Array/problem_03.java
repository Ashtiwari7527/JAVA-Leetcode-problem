package Array;
//  Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//  Return the running sum of nums.


import java.util.Arrays;
import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        int[] answer = runningSum(nums);
        System.out.println(Arrays.toString(answer));


    }
    static int[] runningSum(int[] nums) {


        int[] ans = new int[ nums.length];

        for (int i = 0; i < 1; i++) {
            ans[i] = nums[i];
        }
        for(int n=1;n<nums.length;n++){
            ans[n]=nums[n]+ans[n-1];}
        return ans;
    }
}
