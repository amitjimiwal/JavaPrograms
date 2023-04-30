//WAP using functions to check whether a number is prime or not.

/*
Prime numbers that are divisible either by 1 or by themselves only.
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(primecheck(a));
    }
    static boolean primecheck(int num){
          if (num==1){
              return false;
          }
          else{
              int c=2;
              while (c*c<=num){
                  if (num%c==0){
                      return false;
                  }
                  c++; //c+=1; or c=c+1;
              }
              return true;

          }
    }
}
