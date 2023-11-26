package Recursion;

public class FActorialRecur {
     public static void main(String[] args) {
          System.out.println(fac(5));
     }
     private static int fac(int n) {
          if(n==1) return 1; // base case of recusrion function
          return (n*fac(n-1)); // common body and recurence relation or recursive calls
     }
}
