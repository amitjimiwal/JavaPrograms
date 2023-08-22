package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class TwoDArrays {
     public static void main(String[] args) {
          // declaration of 2D rray
          // int[][] arr=new int[3][];
          // providing row is necessary but column is not,
          String[][] str1=new String[3][]; // this is also valid as no of rows are provided/ mandatory
          //by default all the values are null until we initialize them
          System.out.println(str1.length);
          int[][]arr={
               {1,2,3},
               {4,5,6},
               {7,8,9,10,11}
          };
          System.out.println(Arrays.toString(arr));
          Scanner sc=new Scanner(System.in);
          // input a 2d array
          int[][] str=new int[3][3];
          for (int i = 0; i < str.length; i++) {
               for(int j=0;j<3;j++){
                    str[i][j]=sc.nextInt();
               }
          }
          // output a 2D array
          for (int i = 0; i < str.length; i++) {
                    System.out.println(Arrays.toString(str[i]));
          }
          // using two for loops
          for(int row=0;row<str.length;row++){
               for(int col=0;col<str[row].length;col++){
                    System.out.print(str[row][col]+" ");
               }
               System.out.println();
          }
          // using for each loop
          for(int[] i:str){
               for(int k:i){
                    System.out.print(k+" ");
               }
               System.out.println();
          }
          sc.close();
     }
}
