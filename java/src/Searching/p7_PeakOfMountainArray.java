package Searching;
//find the peak of a mountain array means largest amoung all elements
public class p7_PeakOfMountainArray {
    // mountain array is an array where element increases firstly and then decreases
    public static void main(String[] args) {
        int[] arr={1,3,4,6,3,2,1};
        int ans=peak(arr);
        System.out.println(ans);
    }
    static int peak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start!=end){
            int mid =start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else
                start=mid+1;
        }
        return arr[end];
    }
}
