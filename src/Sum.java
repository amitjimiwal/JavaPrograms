package JavaIntro;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.print("ENter first no: ");
        a=input.nextInt();
        System.out.print("Enter second no: ");
        b=input.nextInt();
        int sum=a+b;
        System.out.println("Sum of both numbers is: "+sum);


    }
}
