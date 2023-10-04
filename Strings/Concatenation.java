package Strings;

import java.util.ArrayList;

public class Concatenation {
     public static void main(String[] args) {
          //character concat- converts it into its ASCII values
          System.out.println('a'+'b'); //195=97+
          
          //string concat- will take it string values only
          System.out.println("a"+"b"); //ab

          System.out.println("a"+1);
          //integer will be converted to its wrapper class Integer and then it will be calling toString() method of the Integer class.

          //complex - same the toString();
          System.out.println("Amit"+new ArrayList<>()); //Amit[]
     }
}
