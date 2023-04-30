package JavaIntro;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        //we have scanner class for taking inputs from usee
        //we inly need to make a object of scanner classs
        //that will take input
        Scanner amit=new Scanner(System.in);

        //taking integer inputs
        System.out.print("ENTER YOUR ROLL NO: ");
        int rollno= amit.nextInt();
        System.out.println("your roll no is "+rollno);

        int a=10;
        //a is the identifier (refernce variable)
        //10 is the literal(object)

        //taking a string as an input
        System.out.print("Enter your name: ");
        String str= amit.next();
        System.out.println("your name is "+str);

        //float input
        System.out.print("Enter your marks: ");
        float marks=amit.nextFloat();
        System.out.println("your marks are "+marks);

    }
}
