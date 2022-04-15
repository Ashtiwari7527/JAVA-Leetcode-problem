package Searching;

public class p4_floorOfTarget {
    public static void main(String[] args) {
        int[] arr = {9,7,5,3,1};  //decreasing sorted array
        int target = 2;
        int answer = floor(arr, target);
        System.out.println(answer);

    }


    static int floor(int[] arr ,int target){
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

        return arr[start];
    }


}
