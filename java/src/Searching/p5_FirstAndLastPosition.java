package Searching;

import java.util.Arrays;

public class p5_FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums= {3,4,7,7,7,8,9,9};
        int target = 7;
       int[] pos = FLposition(nums,target);
        System.out.println(Arrays.toString(pos));

    }
    static int[] FLposition(int[] nums,int target){

        int[] ans = {-1,-1};
        int start=answer(nums,target,true);
        int end=answer(nums,target,false);
        ans[0]=start;
        ans[1]=end;

       return ans;

    }

    static int answer (int[] nums,int target,boolean value){
        int ans=-1;
        int start=0;
        int end= nums.length-1;

        while(start<=end) {

            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = end - 1;
            } else {
                ans=mid;
                if (value) {
                    end = end - 1;
                } else
                    start = mid + 1;
            }

        }
        return ans;
    }

}
