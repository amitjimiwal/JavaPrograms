import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // Solution s=new Solution(); //for LC
        while(t-- >0){
            int n=sc.nextInt();
            // int x=sc.nextInt();
            // int k=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int tar=sc.nextInt();
            System.out.println(isSorted(arr,1,n));
            System.out.println(sum(arr,n-1));
            System.out.println(searchL(arr,n-1,tar));
            // System.out.println(pow(x,n));
            // System.out.println(pow2(x,n));
        }
        sc.close();
    }
   
    private static int searchL(int[] arr, int i, int t) {
        if(i<0) return -1;
        if(arr[i]==t) return i;
        return searchL(arr, i-1, t);
    }

    private static int sum(int[] arr, int i) {
        if(i==0) return arr[i];
        return sum(arr, i-1)+arr[i];
    }

    private static boolean isSorted(int[] arr, int i, int n) {
        if(i==n) return true;
        if(arr[i]<arr[i-1]) return false;
        return isSorted(arr, i+1, n);
    }
    //power in log space complexity
    private static int pow2(int x, int n) {
        if(n==0) return 1;
         if(n%2==0) return pow2(x, n/2)*pow2(x, n/2);
         else return pow2(x, n/2)*pow2(x, n/2)*x;
    }
    //power in linear space complexity
    private static int pow(int x, int n) {
        if(n==1) return x;
        return (x * pow(x,n-1));
    }

    private static int fac(int n) {
        if(n==1) return 1;
        return (n*fac(n-1));
    }

    private static void pdi(int n) {
        if(n==0) return;
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
    private static void printDec(int n) {
        System.out.println(n);
        if(n==1) return;
        printDec(n-1);
    }

}
