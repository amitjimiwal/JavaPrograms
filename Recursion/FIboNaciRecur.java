package Recursion;
// Learn the flow of the recursive calls though recursion tree from notes
public class FIboNaciRecur {
     public static void main(String[] args) {
         System.out.println(fibonacci(7));
     }
     private static int fibonacci(int n) {
          if(n==1 || n==2) return 1; //base condition
          return fibonacci(n-1)+fibonacci(n-2); //common body and recursive calls.
     }
}
