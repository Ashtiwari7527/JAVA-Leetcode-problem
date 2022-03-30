package condition;

import java.util.Scanner;

public class number_occurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        while(n!=0){

            int digit=n%10;
            if (digit== 5 )
            {
                count++;
            }


            n=n/10;
        }
        System.out.println(count);
    }
}
