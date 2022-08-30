package JavaIntro;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //OPERATORS IN JAVA
        int a=7;
        Scanner input=new Scanner(System.in);
        int b= input.nextInt();
        int add=a+b;
        int sub=a-b;
        int multiply=a*b;
        int divide=a/b; //division operator will return the quotient after division.
        int remainder=a%b; //this is the remainder operator. this will return the remainder after division.
        System.out.println("Sum "+add);
        System.out.println("Subtraction "+sub);
        System.out.println("Multiply "+multiply);
        System.out.println("Divide "+divide);
        System.out.println("Remainder"+remainder);
    }
}
