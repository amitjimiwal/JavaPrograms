//WAP that Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,num ,sum=0; // variable declaration.
        System.out.print("Enter x: ");
        x= in.nextInt();
        while (true){
            num=in.nextInt();
            if (num!=x){
                sum+=num;
            }
            else {
                break;
            }
        }
        System.out.println(sum);
    }
}
