package Arrays;

import java.util.ArrayList;

class HarrarList {
     public static void main(String[] args) {
          /*
           * Syntax of ArrayList
           * ArrayList is used when we dont know the size of the Arrays or Dynamic Arrays
           * we can call it.
           * 
           * ArrayList<Datatype> variable=new ArrayList<DataType> ();
           */

          // creating an integer 1D Array
          ArrayList<Integer> arr = new ArrayList<Integer>();
          System.out.println(arr);
          // adding elements to the array
          arr.add(13);
          arr.add(13);
          arr.add(13);
          System.out.println(arr);


          // removing element from the array
          arr.remove(1);
          System.out.println(arr);


          //updating the value at a index
          arr.set(0, 10);
          System.out.println(arr);


          // get a element at a particular index 
          // Imp: array[index] syntax doesn't work on ArrayList we have to use the get method to get the element at a particular index
          System.out.println(arr.get(0));

     }
}
