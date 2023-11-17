package Patterns;
/*
 * 
 * *
 * * *
 * * * *
 */
public class Pattern1 {
     public static void main(String[] args) {
          // pattern4(6); important pattern
          pattern5(5);
     }
     static void pattern1(int n){
        for (int row = 1; row <=n; row++) {
          //each row element printing
          for (int col = 1; col <=row; col++) {
               System.out.print("* ");
          }
          System.out.println();
        }
     }
     static void pattern2(int n){
          for (int row = 1; row <=n; row++) {
               for (int col = 1; col <=n; col++) {
                    System.out.print("* ");
               }
               System.out.println();
          }
     }
     static void pattern3(int n){
          for (int row = 1; row <=n; row++) {
               for (int col = n; col>=row; col--) {
                    System.out.print("* ");
               }
               System.out.println();
          }
     }
     static void pattern5(int n){
        for (int row = 1; row <=(2*n-1); row++) {
          //each row element printing
          int colcount= row>=n ? n-(row%n) :row%n;     
          for(int i=1;i<=colcount;i++){
               System.out.print(" ");
          }
          for (int col = 1; col <=colcount; col++) {
               System.out.print("* ");
          }
          System.out.println();
        }
     }
     static void pattern4(int n){
        for (int row = 1; row <=(2*n-1); row++) {
          //each row element printing
          int colcount= row>=n ? n-(row%n) :row%n;  
          for (int col = 1; col <=colcount; col++) {
               System.out.print("* ");
          }
          System.out.println();
        }
     }

}
