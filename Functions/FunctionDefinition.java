//Definition of a Method.

/*
 syntax:
 access modifier(OOPs) return_type name_of_func(){

     //statements
     return statement;


 }

 Syntax:
 return_type  name_of_func(arguments){
     //statements
     return statement;
 }

 */

import java.util.Scanner;

public class FunctionDefinition {
    public static void main(String[] args) {

//        sum();

        //        int ans=sum2();
//        System.out.println(ans);

        int ans=sum3(29,69);
        System.out.println(ans);


    }

    static int sum3(int a ,int b){
        //passing direct arguments into it at the time of function call
        int sum=a+b;
        return sum;
    }

    static int sum2(){ //returning an integer.
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a= in.nextInt();
        System.out.print("Enter number 2: ");
        int b=in.nextInt();
        int sum=a+b;
        return sum;
        //after return statement no code executes.
//        System.out.println(sum);
    }
    static void sum(){ //not return anything.
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a= in.nextInt();
        System.out.print("Enter number 2: ");
        int b=in.nextInt();
        int sum=a+b;
        System.out.println("Sum is "+sum);
    }
}
