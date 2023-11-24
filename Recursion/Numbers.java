package Recursion;

public class Numbers {
     public static void main(String[] args) {
          //write a function to print 1 to 3 numbers;
          print(1);
     }
     
     private static void print(int i) {
          System.out.println(i);
          print2(2);
     }

     private static void print2(int i) {
          System.out.println(i);
          print3(3);
     }

     private static void print3(int i) {
          System.out.println(i);
     }
}
