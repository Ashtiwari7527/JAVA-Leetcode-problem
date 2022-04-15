package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class problem_09 {
    public static void main(String[] args) {
       int[] nums = {0,1,2,3,4};
       int[] index = {0,1,2,2,1};
        int n=nums.length;
        int[] target =new int[n];
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            ans.add(index[i],nums[i]);

        }


        System.out.println(ans);
    }
}
