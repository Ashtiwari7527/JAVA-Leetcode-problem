package Searching;

public class p3_cieling {
    public static void main(String[] args) {
        int[] arr = {9,7,5,3,1};  //decreasing sorted array
        int target = 2;
        int answer = ciel(arr, target);
        System.out.println(answer);

    }

        // so cieling is that we have to find a no in the array which is equal to or smallest greater than target
        // since we r given a sorted array we will use binary operation
        static int ciel(int[] arr ,int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){

            int mid= start+(end-start)/2;
            if (target>arr[mid]){
                end= mid-1;

            }
            else if (target<arr[mid]){
                start=mid+1;
            }
            else
                return arr[mid] ;

        }
        // here we know that if our value is not found between start and end it will now voilate
        //    our while loop and aur target will be between end and start where (end <start)
            return arr[end];
    }
}
