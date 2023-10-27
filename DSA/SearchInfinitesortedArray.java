package DSA;

public class SearchInfinitesortedArray {
     public static void main(String[] args) {
         int[] arr={1,2,3,4,5,7,8,9,10,11,23,25,27,30};
         System.out.println(ans(arr, 11));
     }
     static int ans(int[] arr,int target){
          int start=0;
          int end=1;
          while(target>arr[end]){
               int temp=end+1;
               end=end+(end-start+1)*2;
               start=temp;
          }
          return binarySearch(arr, target, start, end);
     }
     static int binarySearch(int[] arr, int target,int start,int end) {
          while (start <=end) {
               int mid = (int) (start + end) / 2;
               System.out.println(mid);
               if (arr[mid] > target)
                    end = mid - 1;
               else if (arr[mid] < target)
                    start = mid + 1;
               else
                    return mid;

          }
          return -1;
     }
}
