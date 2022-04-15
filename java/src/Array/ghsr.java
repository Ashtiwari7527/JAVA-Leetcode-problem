package Array;

import java.util.ArrayList;

public class ghsr {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        ArrayList<Integer> list = new ArrayList<>();
        int add = 0;
        int ans=0;

        for (int i = 0; i < num.length; i++) {
            add = add + (num[num.length - (i + 1)] * (int) (Math.pow(10, i)));


        }
        ans = add +k;

        // ans=1234;



        for(int i=((int)(Math.log10(ans))+1)-1;i>=0;i--){
            int digit = ans/ (int)(Math.pow(10,i));

            list.add(digit);
            ans= ans% (int)(Math.pow(10,i));
        }
       System.out.println(list);
    }
}
