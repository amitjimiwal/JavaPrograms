package Searching.BinarySearch;

public class OrderAgnosticBinarySearch {
     public static void main(String[] args) {

     }

     static int orderBinarySearch(int[] arr, int target) {
          int start = 0;
          int end = arr.length - 1;
          boolean isAsc = arr[start] < arr[end];
          while (start < end) {
               // find middle element and explicitly typecast it into a integer value as
               // sometimes it will give a double/float value
               int mid = (int) (start + end) / 2;
               System.out.println(mid);
               if (arr[mid] == target)
                    return mid;
               if (isAsc) {
                    if (arr[mid] > target)
                         end = mid - 1;
                    else
                         start = mid + 1;
               } else {
                    if (arr[mid] > target)
                         start = mid + 1;
                    else
                         end = mid - 1;
               }

          }
          return -1;
     }
}
