package condition;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ans=0;


        while (true) {

            char op = input.next().charAt(0);


            if (op == '+' || op == '*' ||  op == '-') {


                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(op=='+'){
                    ans=ans+num1+num2;
                }

                if(op=='-'){
                    ans=ans-num1-num2;
                }



                if(op=='*'){
                    ans=ans*num1*num2;
                }
                System.out.println(ans);
            }


            else if (op == 'x' || op == 'X') {
                  break;
            }


            else
                System.out.println("invalid operation");


        }
        System.out.println(ans);

    }
}
