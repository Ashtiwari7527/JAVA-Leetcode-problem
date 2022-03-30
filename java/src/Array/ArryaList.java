package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArryaList {
    //used to enter as many enteries as u want

    public static void main(String[] args) {
      //  ArrayList<Integer> list = new ArrayList<>();
       // list.add(23);
      //  list.add(89);
       // list.add(34);
       // list.add(45);
       // list.add(66);

        //System.out.println(list);


        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){

            list.add(input.nextInt());

        }
        System.out.println(list);
    }
}
