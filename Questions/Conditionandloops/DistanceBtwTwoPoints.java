//WAP to Calculate Distance Between Two Points
/*
for ex;
a=5
b=8 then output should be 3.
 */


/*

 LOGIC:
 To get the distance between two points on number line
 we have to start the loop from lesser number to higher number
 and increasing count(distance) by 1 everytime loop runs.

 */

import java.util.Scanner;

public class DistanceBtwTwoPoints {
    public static void main(String[] args) {
        Scanner inn=new Scanner(System.in);
        int a= inn.nextInt(); //first integer
        int b= inn.nextInt(); //second integer
        int distance=0; //distance between points.

        if (a>b){
            for (int i=b; i<a; i++){
                distance+=1;
            }
            System.out.println(distance);
        }
        else if (b>a) {
            for (int i=a; i<b; i++){
                distance+=1;
            }
            System.out.println(distance);
        }
        else {
            System.out.println(distance);
        }
    }
}
