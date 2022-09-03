//WAP to print factorial of a number
/*
 for ex
 input=5 then o/p=120
 input=4 then o/p=24
 and so on

 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int fact=1; //initialising factorial =1;
        if (n==0){ // as factorial of zero is always 1
            System.out.println(fact);
        }
        else {
            for (int i = 1; i <=n ; i++) {
                fact*=i;

            }
            System.out.println(fact);
        }


    }
}
