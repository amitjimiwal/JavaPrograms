package Searching.BinarySearch;

public class Main {
     public static void main(String[] args) {
          int[] arr={1,2,3,4,5,6,7,8,9,10};
          System.out.println(binarySearch(arr, 1));

     }
     //returns the index
     //return -1 if element not found
     static int binarySearch(int[] arr,int target){
          int start=0;
          int end=arr.length-1;
          System.out.println(start);
          System.out.println(end);
          while(start<end){
               // find middle element and explicitly typecast it into a integer value as sometimes it will give a double/float value
               int mid=(int)(start+end)/2;
               System.out.println(mid);
               if(arr[mid]==target) return mid;
               if(arr[mid]>target) end=mid-1;
               if(arr[mid]<target) start=mid+1;
          }
          return -1;
     }
}
