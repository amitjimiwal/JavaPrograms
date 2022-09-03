//WAP to reverse an integer
/*
  ex if n=12345
    then o/p=54321
 */

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n; //input integer
        int rev=0; //the reverse integer variable
        n=in.nextInt();
        while (n>0){
            int rem =n%10; //last digit of an integer return
            rev=rev*10+rem;
            n/=10;  // n=n/10 -remove the last digit from the integer
        }
        System.out.println(rev);
    }
}
