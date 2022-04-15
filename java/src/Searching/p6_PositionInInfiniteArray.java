package Searching;

public class p6_PositionInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9}; // suppose it is an infinite length array so we don't know its length
        int target = 7;
        int answer = position(arr, target);
        System.out.println(answer);

    }

    static int position(int[] arr, int target) {
        // through this method we will provide start and end of chunk containing our target array
        // suppose we will take firstly the chunk of 2 element and then keep on doubling it
        int start = 0;
        int end = 1;
        while (arr[end] < target) { // here we are using end as we know we r given a inc sorted array so till we find a chunk in which target element
            //lies end will be < than target
            int temp = end;
            end = end + (end - start + 1) * 2;
            start = temp+1;
        }
        int pos = index(start, end,target,arr);
        return pos;
    }
    static int index(int start,int end,int target,int[] arr){


        while(start<=end) {
            int mid=start+(end-start)/2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else
                return mid;
        }
        return -1;
    }
}

