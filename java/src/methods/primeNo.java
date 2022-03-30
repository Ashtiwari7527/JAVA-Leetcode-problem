package methods;

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
       boolean answer= prime(n);
        System.out.println(answer);

    }

    static boolean prime(int n){

        if (n<=1){
            return false;}
        int c=2;
            while(c<n){
                if (n%c==0) {
                    return false;
                }
                       c++;

                }

                if(c>=n){
                    return true;
                }
                return false;

        }



    }






