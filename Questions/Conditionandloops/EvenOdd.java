
//WAP to check for a number is even or odd.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        if (n==0){
            System.out.println("nOne");
        }
        else if (n%2==0) {
            System.out.println("EvEn");
        }
        else {
            System.out.println("Odd");
        }

    }
}
