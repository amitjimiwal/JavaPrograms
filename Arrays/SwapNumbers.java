package Arrays;

import java.util.Arrays;

public class SwapNumbers {
     public static void main(String[] args) {
          int[] array={1,2,4,3,5};
          Solution s1=new Solution();
          s1.swap(array, 2, 3);
          System.out.println(Arrays.toString(array));
          
     }
}

class Solution{
    public void swap(int[] arr,int i,int j){
     int temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
    }
}