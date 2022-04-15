package Array;

import java.util.Arrays;

public class problem_13 {
    public static void main(String[] args) {
        int[][] image ={{1,1,0},{1,0,1},{0,0,0}};
        for(int row=0;row<image.length;row++) {
            int i = 0;
            int j = image[row].length - 1;
            for (i = 0; i < j; i++, j--) {
                int temp = image[row][i];
                image[row][i] = image[row][j];
                image[row][j] = temp;

            }
        }

        for(int row=0;row<image.length;row++){
            for(int col=0;col<image[row].length;col++){
                if(image[row][col]==0){
                    image[row][col]=1;
                }
                else if(image[row][col]==1){
                    image[row][col]=0 ;
                }
            }

            System.out.println(Arrays.toString(image[row]));
        }


    }
}
