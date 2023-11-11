package src;

import java.util.HashMap;

public class Printing {
     public static void main(String[] args) {
          int a=10;
          //I have to make something like a template string literal of javascript in Java.
          System.out.printf("Your marks is %d ",a); //Your marks is a.
          System.out.println('a'+'b'); //196
          System.out.println("a"+"b");//ab
          System.out.println("a"+1); //a1
          System.out.println(new HashMap<>()+"amit"); //every complex datatype or structure with " " in concatenation will be converted and toString() method is called.
     }
}
