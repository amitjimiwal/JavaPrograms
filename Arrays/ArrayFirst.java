package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFirst {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          /*
           array declaration
           datatype[] reference_variable = new datatype[size];
           */
          int[] arr = new int[5];
          arr[0]=1;
          arr[1]=2;
          arr[2]=3;
          arr[3]=4;
          arr[4]=5;
          System.out.println(arr[3]);

          // input using for loop
          for (int i = 0; i < arr.length; i++) {
               arr[i] = sc.nextInt();
          }
          //printing the array
          for (int i = 0; i < arr.length; i++) {
               // arr[i] = sc.nextInt();
               System.out.println(arr[i]);
          }

          // for each loop or enhanced for loop : for iterating over arrays
          /*
           for( datatype refernce_variable : array_name ){
               datatype refernce_variable = sc.nextInt();
               System.out.println(refernce_variable);
           }
           */
          for (int i : arr) { //i represent the element in the array not the index like the for loop
               System.out.println(i);
          }

          // for strings array
          String[] str=new String[4];
          str[0]="A";
          str[1]="B";
          str[2]="C";
          str[3]="D";
          for(String s:str){
               System.out.println(s);
          }

          //  Arrays.toString(arrayname) : used for prinitng the array (best way to print an array to the console);
          int[] ar3=new int[4];
          ar3[0]=1;
          ar3[1]=2;
          ar3[2]=3;
          ar3[3]=4;
          System.out.println(Arrays.toString(ar3)); //[1, 2, 3, 4] output
          // its used only for printing an array.
     }
}
