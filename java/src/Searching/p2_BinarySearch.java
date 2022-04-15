package Searching;
// Binary search is widely used to minimize the time consumption ans and it makes our code more optimized

public class p2_BinarySearch {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        int target =6;
        // suppose here we don't know whether it is an ascending order array or of descending order;
        // lets figure it out using first and last element

        int start=0;
        int end = nums.length-1;
while(start<=end) {
    int middle = start + (end - start) / 2;
    if (nums[middle] == target) {
        System.out.println(middle);
    }
    // if starting element is less than ending element it is an ascending order sorted array

    if (nums[start] < nums[end]) {
        if (nums[middle] > target) {
            end = middle - 1;
        } else
            start = middle + 1;
    }

    // if starting element is less than ending element it is a descending order sorted array

    if (nums[start] > nums[end]) {
        if (nums[middle] > target) {
            start = middle + 1;
        } else
            end = middle - 1;
    }

       }
    }
}
