package Array;
//     Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
//     Return the answer in an array.


import java.util.Arrays;

public class problem08 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
       smallernum(nums);
        System.out.println(Arrays.toString(nums));

    }

    static int[] smallernum(int[] nums) {



        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] > nums[j] ) {
                    count++;
                }

            }
            nums[i]=count;

        }
        return nums;

    }
}