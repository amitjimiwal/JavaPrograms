package Recursion;

/**
  Recursion is nothing but a "FUNCTION CALLING ITSELF". 
 */
public class HelloWorld {
     public static void main(String[] args) {
          // write a function to print Hello World 3 times
          message();
     }
     // All the function defined below have "SAME DECLARATION AND BODY"
     static void message() {
          System.out.println("Hello world");
          m2();
     }

     static void m2() {
          System.out.println("Hello world");
          m3();
     }

     private static void m3() {
          System.out.println("Hello World");
     }

}