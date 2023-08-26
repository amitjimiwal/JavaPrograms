package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReverse {
     public static void main(String[] args) {
          int[] l2=new int[4]; //fixed size of 4 array cannot be changes
          ArrayList<Integer> b1=new ArrayList<>(); //size is not fixed is of variable array.
          b1.add(1);
          b1.add(2);
          b1.add(3);
          b1.add(2,10);
          System.out.println(b1);
          System.out.println(reverse(b1));
     }
     static List<Integer> reverse(List<Integer> arr){
          for(int i=0;i<arr.size();i++){
               arr.add(i, arr.get(arr.size()-1));
               arr.remove(arr.size()-1);
          }
          return arr;
     }
}
