package Array;
//    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//    Return the array in the form [x1,y1,x2,y2,...,xn,yn].

import java.util.Arrays;
import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();

        int[] nums = new int[n*2];
        for(int i=0;i<nums.length;i++){
            nums[i]=input.nextInt();
        }
     int[] answer=  shuffle (nums,n);
        System.out.println(Arrays.toString(answer));

    }
    static int[] shuffle(int[] nums, int n) {
        int[] arr= new int[nums.length];
        for(int i=0;i<(nums.length)/2;i++,n-=1){
            arr[nums.length-(2*n)]=nums[i];
        }
        n=nums.length/2;
        for(int i=nums.length/2;i<nums.length;i++,n--) {


            arr[nums.length - ((2*n) -1)] = nums[i];

        }
        return arr;
    }
}
