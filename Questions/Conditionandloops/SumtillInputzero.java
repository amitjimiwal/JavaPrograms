//WAP to take integer inputs from the user till user
// enters 0 and print the sum of all numbers till that.
/*
  for ex-
  n=1
  n=2
  n=3
  n=0
  are inputs from user then
  output=1+2+3=6
 */

import java.util.Scanner;

public class SumtillInputzero {
    public static void main(String[] args) {
        int n=1,sum=0;
        //we have given n=1 to initialsise the loo
        // if we dont give n a value loop will not run as n doesnt have any value to compare with in the start.
        Scanner in=new Scanner(System.in);
        while (n!=0){
            n=in.nextInt();
            sum+=n;
        }
        System.out.println(sum);
    }
}
