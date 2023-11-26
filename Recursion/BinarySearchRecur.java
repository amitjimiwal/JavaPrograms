package Recursion;

public class BinarySearchRecur {
     public static void main(String[] args) {
      int[] arr={0,1,2,3,4,5,6};
      int n=6;
      System.out.println(BS(arr, 4, 0, n));
     }

     static int BS(int[] arr,int target,int l,int h){
          if(l>h) return -1; //base case
          int m=(int)(l+h)/2; //common body
          if(arr[m]==target) return m;
          else if(arr[m]<target) return BS(arr, target, m+1, h); //recursive calls.
          return BS(arr, target, l, m-1);
     }
}
