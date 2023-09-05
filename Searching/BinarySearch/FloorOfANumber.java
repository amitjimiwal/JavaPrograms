package Searching.BinarySearch;

public class FloorOfANumber {
     public static void main(String[] args) {
          int[] arr={2,3,5,9,14,16,18};
          System.out.println(floorNumber(arr, 17));
     }
     static int floorNumber(int[] arr,int target){
          int start=0;
          int end=arr.length-1;
          while(start<=end){
               int mid=(int)(start+end)/2;
               if(arr[mid]==target) return mid;
               else if(arr[mid]>target) end=mid-1;
               else start=mid+1;
          }
          return end;
     }   
}
