import java.util.Scanner;

public class LargestOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int max=a;
        if (b>max){
            max=b;
            System.out.println();
        }
        if (c>max){
            max=c;
        }
        System.out.println(max);
        //Method 2;
//        if (a>b && a>c){
//            System.out.println(a+" is the largest among 2");
//        } else if (b>a && b>c) {
//            System.out.println(b+" is the largest among 2");
//        } else {
//            System.out.println(c+" is the largest among 2");
//        }
    }





}


