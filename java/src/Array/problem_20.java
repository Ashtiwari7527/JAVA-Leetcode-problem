package Array;

import java.util.ArrayList;

public class problem_20 {
    public static void main(String[] args) {
       int[][] matrix= {{3,7,8},{9,11,13},{15,16,17}};
        ArrayList<Integer> list= new ArrayList<>();
        int max =0;
        int add=0;
        while(add<matrix[0].length){


            for(int i =0;i<matrix.length;i++){


                if(matrix[i][add]>max){
                    max =matrix[i][add];
                }


                int min=matrix[i][0];

                for(int k=0;k<1;k++){

                    for(int j=0;j<matrix[k].length;j++){

                        if (min<matrix[k][j]){
                            min =matrix[k][j];

                        }


                    }
                    if (max==min){
                        list.add(max);
                    }

                }
            }
            add++;
        }


    }


}



