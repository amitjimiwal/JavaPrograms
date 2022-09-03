//WAP to Take integer inputs till the user enters 0 and print the largest number from all.
/*
  for ex-
  n=1
  n=2
  n=3
  n=0
  are inputs from user then
  output=3 (as it is the maximum among them)
 */


import java.util.Scanner;

public class SumTillInputZeroAndMax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=1;
        int max = Integer.MIN_VALUE;
        /*
        The Integer. MIN_VALUE is a constant in the Integer class that represents the minimum or least integer
         value that can be represented in 32 bits, which is -2147483648, -2^31. This is the lowest value that any integer
          variable in Java can hold.
         */
        int dummy; //dummy variable to store user inputs at each part of the loop.
        while (n!=0){
            n=in.nextInt();
            dummy=n;
            if (dummy>max && n!=0){
                max=dummy;
            }
        }
        System.out.println(max);
    }
}
