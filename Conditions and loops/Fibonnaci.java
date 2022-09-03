//WAP to print fibonaaci series
/*
starts with zero and one and next number is the
sum of last two number.
     0 1 1 2 3 5 8 13 21......
 */



import java.util.Scanner;


public class Fibonnaci {
    public static void main(String[] args) {
        int a=0,b=1,n,c=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for (int i = 2; i <=n ; i++) {
            c= a+b;
            a=b;
            b=c;
        }
        System.out.println(c);

    }
}
