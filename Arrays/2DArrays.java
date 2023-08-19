package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class TwoDArrays {
     public static void main(String[] args) {
          // declaration of 2D rray
          // int[][] arr=new int[3][];
          // providing row is necessary but column is not,
          int[][]arr={
               {1,2,3},
               {4,5,6},
               {7,8,9,10,11}
          };
          System.out.println(Arrays.toString(arr[0]));
          Scanner sc=new Scanner(System.in);
          // input a 2d array
          int[][] str=new int[3][3];
          for (int i = 0; i < str.length; i++) {
               for(int j=0;j<3;j++){
                    str[i][j]=sc.nextInt();
               }
          }
          for (int i = 0; i < str.length; i++) {
                    System.out.println(Arrays.toString(str[i]));
          }
          sc.close();
     }
}
