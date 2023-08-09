/*
 Problem:
 https://www.hackerrank.com/challenges/java-loops/problem

 */

 import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(); //q no of queries = no of series we have to print
        for(int i=0;i<t;i++){ //for printing a series
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){ // no of term of series
                int firstterm=a;
                int sum=0;
                for(int k=0;k<j+1;k++){ //calculating thew value of each term of a series
                    int power=(int)Math.pow(2,k);
                    int value=b*power;
                    sum+=value;
                }
                System.out.print(firstterm+sum+" ");
            }
            System.out.println("");
        }
        in.close();
    }
}
