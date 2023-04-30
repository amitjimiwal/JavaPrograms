import java.util.Scanner;

public class FunctionIntro {
    public static void main(String[] args) {
       //Q. take input fo two numbers and print the sum.
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a= in.nextInt();
        System.out.print("Enter number 2: ");
        int b=in.nextInt();
        int sum=a+b;
        System.out.println("Sum is "+sum);
        /*
        If the user ask to perform the sum 100 times after this
        then copy pasting this whole code 100 times will make the length
        of program more and more which is not a good practice...
        So in order to remove this we use the functions.... in which we onnly have
        to define a code one timme and can use it as many times we want...

         */

    }
}
