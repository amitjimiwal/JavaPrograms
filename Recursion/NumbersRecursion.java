package Recursion;

public class NumbersRecursion {
     public static void main(String[] args) {
          print(1);
     }

     static void print(int n) {
          if (n == 5) { // base condition
               System.out.println(n);
               return;
          }
          // common body
          System.out.println(n);

          // recursive call
          print(n + 1);
     }
}
