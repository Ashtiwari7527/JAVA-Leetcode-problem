package Searching;

//linear searching is basically finding the target element in the array using loop

public class P1_LinearSearch {
    public static void main(String[] args) {
        int[] nums={1,3,4,5,6,23,7};
        int target =6;
      int answer=  LinearSearch(nums,target);
        System.out.println(answer);
    }
    static int LinearSearch(int[] nums,int target){
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}



