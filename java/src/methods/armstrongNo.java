package methods;

import java.util.Scanner;


public class armstrongNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
       boolean answer= armstrong(n);
        System.out.println(answer);
    }

    static boolean armstrong(int n){
        int org=n;
        int add=0;
        while(n!=0){
            int digit=n%10;
            n=n/10;

            add=add+(digit*digit*digit);

        }
        if ( add==org){
            return true;
        }

         return false;

}
}
