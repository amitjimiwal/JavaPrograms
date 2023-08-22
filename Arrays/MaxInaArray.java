package Arrays;

public class MaxInaArray {
     public static void main(String[] args) {
          int[] array={1,2,5,95,66};
          System.out.println(maxInaArray(array));
          System.out.println(maxInRanfge(array, 2, 4));
     }
     static int maxInaArray(int[] arr){
          int max=Integer.MIN_VALUE;
          for (int element : arr) {
               if(element>max) max=element;
          }
          return max;
     }
     static int maxInRanfge(int[] arr,int start,int end){
          int max=Integer.MIN_VALUE;
          for(int i=start;i<=end;i++){
               if(arr[i]>max) max=arr[i];
          }
          return max;
     }
}
