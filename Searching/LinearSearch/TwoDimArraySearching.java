package Searching.LinearSearch;

import java.util.Arrays;

public class TwoDimArraySearching {
     public static void main(String[] args) {
          int[][] matrix={
               {1,2,5},{4,3,9},{6,10,12}
          };
          System.out.println(Arrays.toString(LinearSearch2D(matrix,4)));
     }
     static int[] LinearSearch2D(int[][] matrix,int target){
          //Tc: O(n^2);
          for(int r=0;r<matrix.length;r++){
               for(int c=0;c<matrix.length;c++){
                 if(matrix[r][c]==target) return new int[]{r,c};
               }
          }
          return new int[]{-1,-1};
     }
}
