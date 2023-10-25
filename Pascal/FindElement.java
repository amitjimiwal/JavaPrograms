package Pascal;

import java.util.Scanner;
//program to find the rth row's cth column element of a pascal triangle.
public class FindElement{
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter row: ");
          int r=sc.nextInt();
          System.out.print("Enter col: ");
          int c=sc.nextInt();
          System.out.println(ncr(r-1, c-1));
     }
     static float ncr(int r,int c){
          float res=1;
          for (int i = 0; i < c; i++) {
               res*=(r-i);
               res/=(c-i);
          }
          return res;
     }
}