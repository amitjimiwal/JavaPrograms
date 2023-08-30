package Searching.LinearSearch;

public class SearchInRange {
     public static void main(String[] args) {
          int[] arr = { 1, 2, 3, 4, 5, 56, 6, 64, 44 };
          int ans=linearSearch(arr, 56,0,5);
          String result = ans ==-1 ? "Not present" : "Present at index " + ans;
          System.out.println(result);
     }
     
     static int linearSearch(int[] arr, int num,int start,int end) {
          // if the array is empty
          if (arr.length == 0) {
               return -1;
          }
          // run a loop to compare every value in the array
          for (int index = start; index <= end; index++) {
               if (arr[index] == num) {
                    return index;
               }
          }
          return -1;
     }

}
