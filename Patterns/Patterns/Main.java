import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Guys !!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        patternImp(n)
        sc.close();
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            int colcount = row >= n ? n - (row % n) : row % n;
            for (int col = 1; col <= colcount; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            // spacing logic
            int space = row > n ? row - n : n - row;
            for (int sp = 1; sp <= space; sp++) {
                System.out.print(" ");
            }
            int colcount = row >= n ? n - (row % n) : row % n;
            for (int col = 1; col <= colcount; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // spacing logic
            int space = n - row;
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("  ");
            }
            for (int i = row; i >= 1; i--) {
                System.out.print(i + " ");
            }
            for (int i = 2; i <= row; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            // spacing logic
            int space =row > n ? row - n : n - row;;
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("  ");
            }
            int colcount = row >= n ? n - (row % n) : row % n;
            for (int i = colcount; i >= 1; i--) {
                System.out.print(i + " ");
            }
            for (int i = 2; i <= colcount; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static void patternImp(int n){
        for (int row = 1; row <=2*n-1; row++) {
            for (int col = 1; col <=2*n-1; col++) {
                int valAtIndex=n-(Math.min(Math.min(2*n-1-col, col-1),Math.min(row-1,2*n-1-row )));
                System.out.print(valAtIndex +" ");
            }
            System.out.println();
        }
    }

}