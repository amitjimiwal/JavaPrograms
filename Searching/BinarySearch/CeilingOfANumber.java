package Searching.BinarySearch;
/*
 Given an array of positive integers and you have to find the ceiling of target in the array
 Ceiling of a number is the smallest number greater than or equal to that number;
 */
public class CeilingOfANumber {
     public static void main(String[] args) {
          int[] arr={2,3,5,9,14,16,18};
          System.out.println(ceilingNumber(arr, 17));
     }
     static int ceilingNumber(int[] arr,int target){
          int start=0;
          int end=arr.length-1;
          while(start<end){
               int mid=(int)(start+end)/2;
               if(arr[mid]==target) return mid;
               else if(arr[mid]>target) end=mid-1;
               else start=mid+1;
          }
          return start;
     }
}
