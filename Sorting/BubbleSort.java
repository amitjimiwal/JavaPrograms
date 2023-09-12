/*
 * Bubble sort is a sorting algorithm that is stable . Its basically works upon swapping two adjacent values of an data structure.
 */

import java.util.Arrays;

public class BubbleSort {
     public static void main(String[] args) {
          int[] arr={2,3,4,5,3}; //worst case : 0(N^2) Array is not sorted
          int[] arr2={1,2,3,4,5}; //best case :O(N) Array is sorted
          bubbleSort(arr);
          bubbleSort(arr2);
          System.out.println(Arrays.toString(arr));
           System.out.println(Arrays.toString(arr2));
     }
     static void bubbleSort(int[] arr){
          boolean swapped;
          //we have to make n-1 passes or length of array
          for (int i = 0; i < arr.length; i++) {
               System.out.println(i);
               swapped=false;
               //for each pass i, we have to make the largest element of the array to the end position
               for (int j = 1; j < arr.length-i; j++) {
                    if(arr[j-1]>arr[j]){
                         swap(j-1, j, arr);
                         swapped=true;
                    }
               }
               if(!swapped){
                    break;
               }
          }
     }
     static void swap(int i,int j,int[]arr){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
     }
}
