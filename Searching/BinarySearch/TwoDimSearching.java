package Searching.BinarySearch;

import java.util.Arrays;

public class TwoDimSearching {
     public static void main(String[] args) {
          int[][] matrix={
               {10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}
          };
          System.out.println(Arrays.toString(BinarySearch2D(matrix, 33)));
     }
     static int[] BinarySearch2D(int[][] mat,int target){
          int r=0;
          int c=mat.length-1;
          while(r<mat.length && c>=0){
              if(mat[r][c]==target) return new int[]{r,c};
              else if(mat[r][c]>target) c--;
              else r++;
          }
          return new int[]{-1,-1};        
     }
}
