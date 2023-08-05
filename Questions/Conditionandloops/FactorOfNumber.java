/*
 WAP to find factors of a given entered number.
 for ex: if user enters 6 then , factors will be : 1,2,3,6
 Sol:
   the factor of a number should be <= that number and should divide that number . i.e, number%factor ==0;
 */

import java.util.Scanner;

public class FactorOfNumber {
         public static void main(String[] args) {
                  Scanner s = new Scanner(System.in);
                  int n = s.nextInt();
                  // started i with 1 because 0 not divide anything and 1 divides every number you
                  // can use i=2 also if you don't want 1 also to be printed as factors
                  for (int i = 1; i <= n; i++) {
                           if (n % i == 0)
                                    System.out.print(i + " ");
                  }
                  s.close();
         }
}
