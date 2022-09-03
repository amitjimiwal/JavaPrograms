//WAP THAT COUNTS THE OCCURENCE OF THE DIGIT
// IN AN INTEGER
/*
 ex n=12343323
  and we have to count 3
  then o/p=4
 */

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        int count=0,find;
        long n ,rem;
        Scanner in=new Scanner(System.in);
        n=in.nextLong();
        find=in.nextInt();
        while (n>0){
            rem=n%10;
            if (rem==find){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);

    }
}
