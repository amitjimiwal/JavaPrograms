/*
ARMSTRONG NUMBER
Armstrong numberr is the sum of the cubes of digits of a number
  for ex ;
    if n=123;
     then its armstrong number will be:
        armstrong=1^3+2^3+3^3=1+8+27=36
 */


import java.util.Scanner;

public class ArmstrongNumber {
    static  int armstrong=0; //initialising and declaring it
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt(); //user input of n
        System.out.println(ArmstrongCheck(num));
    }

    static int ArmstrongCheck(int n) {// int return type function with name ArmstrongCheck
       int armstrong=0; //It shadows the static int declaration and in this block of code armstrong=1 will be used.
        //thEREFORRE THE LOW LEVEL will shadow the high level. Its called shadowing.
        while (n>0){
            int rem=n%10; //return the last digit of intger
            armstrong+=Math.pow(rem,3); //to calculate raise to power we have to do by Math class in java which has a pow
            // method to calculate it. pow(a,b) represents a raise to power b i.e, (a)^b
            n/=10;
        }
        // return armstrong==n; it is giving false even if they both are equal because here we are checkng the reference variables are pointing to the same object or not which they are not 
        return armstrong;
    }
}
