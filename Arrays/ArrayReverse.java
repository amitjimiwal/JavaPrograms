package Arrays;

import java.util.Arrays;

public class ArrayReverse {
     public static void main(String[] args) {
          int[] array = { 1, 2};
          int n = array.length;
          int i = 0;
          int j = n - 1;

          // logic1
          while (i<j) {
               // logic for even number of arrays reversal
               // if (j == i - 1 && i > j)
               //      break;
               swap(array, i, j);
               i++;
               j--;
          }
          // logic2
          while (i < j) {
               swap(array, i, j);
               i++;
               j--;
          }
          System.out.println(Arrays.toString(array));
     }
     static void swap(int[] arr, int i, int j) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
     }
}
