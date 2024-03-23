import java.util.*;
class Basic{
    public static void main(String[] args){
          primestillN(20);
          System.out.println(sqroot(a));
          System.out.println(newtonsqroot(40));
          System.out.println(factorsofN(361));
          //Striver SDE Sheet Qusetions
    }
    static void primestillN(int n) {
          boolean[] isprime = new boolean[n + 1];
          for (int i = 2; i * i <= n; i++) {
               if (!isprime[i]) {
                    for (int j = 2 * i; j <= n; j += i) {
                         isprime[j] = true;
                    }
               }
          }
          for (int i = 2; i <= n; i++) {
               if (!isprime[i])
                    System.out.print(i + " ");
          }
     }

     static int sqroot(int n) {
          int s = 1, e = n;
          while (s <= e) {
               int m = (int) (s + e) / 2;
               int v = m * m;
               if (v == n)
                    return m;
               else if (v > n)
                    e = m - 1;
               else
                    s = m + 1;
          }
          return e;
     }

     static double newtonsqroot(int n){
          double x=n;
          double root;
          while (true) {
               root=0.5*(x+(n/x));
               if(Math.abs(root-x)<0.1) break;
               x=root;
          }
          return root;
     }
     static List<Integer> factorsofN(int n){
          ArrayList<Integer> arr=new ArrayList<>();
          int i=1;
          while(i*i<=n){
               if(n%i==0){
                    arr.add(i);
                    arr.add(n/i);
               }
               i++;
          }
          Collections.sort(arr);
          return arr;
     }
}