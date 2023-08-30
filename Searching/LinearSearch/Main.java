package Searching.LinearSearch;

public class Main {
     public static void main(String[] args) {
          // code for Linear Search
          int[] arr = { 1, 2, 3, 4, 5, 56, 6, 64, 44 };
          // String result = linearSearch(arr, 100) == -1 ? "Not present" : "Present at index " + linearSearch(arr, 100);
          // System.out.println(result);
          System.out.println(linearTwoPointerSearch(arr, 56));
     }

     static int linearSearch(int[] arr, int num) {
          // if the array is empty
          if (arr.length == 0) {
               return -1;
          }
          // run a loop to compare every value in the array
          for (int index = 0; index < arr.length; index++) {
               if (arr[index] == num) {
                    return index;
               }
          }
          return -1;
     }

     static int linearTwoPointerSearch(int[] arr, int num) {
          //linear search using two pointer approach. Its T.C will be less than that of normal linear search as it wil take n/2 iterations in worst case scenario
          if (arr.length == 0) {
               return -1;
          }
          int start=0;
          int end=arr.length-1;
          while(start<=end){
             if(arr[start]==num) return start;
             if(arr[end]==num) return end;
          }
          return -1;
     }
}
