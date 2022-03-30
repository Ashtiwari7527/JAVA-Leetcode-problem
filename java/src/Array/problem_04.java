package Array;
//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
// ith  customer has in the jth bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts.
// The richest customer is the customer that has the maximum wealth

import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=input.nextInt();
        int j= input.nextInt();
   int[][] accounts=new int[i][j];
   for(int a=0;a <accounts.length;a++){
       for(int b=0;b<accounts[a].length;b++){
           accounts[a][b]=input.nextInt();
       }
   }
  int answer = maximumWealth(accounts);
        System.out.println("maximus welath is : "+ answer);
    }
    static int maximumWealth(int[][] accounts) {

        int max=0;

        for(int row=0;row<accounts.length;row++){
            int sum=0;
            for(int col=0;col<accounts[row].length;col++){

                sum=sum+accounts[row][col];

            } if (sum>max){
                max = sum;

            }
        }

        return max;
}
}
