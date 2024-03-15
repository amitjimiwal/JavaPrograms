import java.util.*;

class Demo {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int i = sc.nextInt();
          // System.out.println("Hello World" + a);

          // System.out.println(getDivisors(a));
          // System.out.println(checkPrime(a));
          // System.out.println(rightmostSetBit(a));
          // String z=Integer.toBinaryString(10);
          // System.out.println(z);
          // System.out.println(23+'1');
          // System.out.println("hello");
          // System.out.println(findUnique2(new int[] { 2, 2, 2, 3, 3, 3, 4, 5, 4, 5, 4,
          // 5, 6 }));
          // System.out.println(magicNo(a));
          System.out.println(findDigit(a, i));
          System.out.println(ncr(a, 0));
          System.out.println(findSum(6));
          System.out.println(calculateApowB(a, i));
          System.out.println(xorzerotoa(a));
          sc.close();
     }

     static boolean checkPrime(int n) {
          for (int i = 2; i < Math.sqrt(n); i++) {
               if (n % i == 0)
                    return false;
          }
          return true;
     }

     static ArrayList<Integer> getDivisors(int n) {
          ArrayList<Integer> ds = new ArrayList<>();
          ds.add(1); // 1 is divisor of every number;
          for (int i = 2; i < n; i++) {
               if (n % i == 0)
                    ds.add(i);
          }
          ds.add(n);
          return ds;
     }

     static String EvenOdd(int n) {
          return (n & 1) == 1 ? "Odd" : "Even";
     }

     static int findUnique(int[] arr) {
          int xor = 0;
          for (int i : arr) {
               xor ^= i;
          }
          return xor;
     }

     static int findithBit(int n, int i) {
          // n=n>>(i-1);
          return (n & (1 << (i - 1)));
     }

     static int setithBit(int n, int i) {
          int operator = 1 << (i - 1);
          return n | operator;
     }

     static int resetithBit(int n, int i) {
          int op = ~(1 << (i - 1));
          return n & op;
     }

     static int rightmostSetBit(int n) {
          if (n == 0)
               return -1;
          int pos = 1;
          while (n != 0) {
               int lb = n & 1;
               if (lb == 1)
                    break;
               else {
                    pos++;
                    n >>= 1;
               }
          }
          return pos;
     }

     static String findUnique2(int[] arr) {
          int[] bitssum = new int[32];
          for (int i : arr) {
               String s = Integer.toBinaryString(i);
               System.out.println(s);
               for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '1')
                         bitssum[31 - s.length() + j + 1] = (bitssum[31 - s.length() + j + 1] + 1) % 3;
               }
          }
          String ans = "";
          boolean isone = false;
          for (int i = 0; i < 32; i++) {
               if (bitssum[i] == 1) {
                    if (isone == false)
                         isone = true;
               }
               if (isone)
                    ans += Integer.toString(bitssum[i]);
          }
          System.out.println(Arrays.toString(bitssum));
          return ans;
     }

     static int magicNo(int n) {
          int magic = 0;
          int b = 5;
          // String sb=Integer.toBinaryString(n);
          // for(int i=0;i<sb.length();i++){
          // if(sb.charAt(i)=='1') magic+=Math.pow(5, sb.length()-i);
          // }

          // another approach using more of Bit Manipulation
          while (n > 0) {
               int lb = n & 1;
               n = n >> 1;
               magic += lb * b;
               b *= 5;
          }
          return magic;
     }

     static int findDigit(int n, int b) {
          double value = Math.log(n) / Math.log(b);
          value = Math.ceil(value);
          return (int) value;
     }

     static int findSum(int r) {
          // normal approach
          // int s=0;
          // for (int i = 0; i < r; i++) {
          // s+=ncr(r-1, i);
          // }
          // return s;

          // using Bit Manipulation Approach;
          return 1 << r;
     }

     static int ncr(int r, int c) {
          if (c == 0)
               return 1;
          int v = 1;
          for (int i = 0; i < c; i++) {
               v = v * (r - i);
               v = v / (i + 1);
          }
          return v;
     }

     static int calculateApowB(int a, int b) {
          int ans = 1;
          int f = a;
          while (b > 0) {
               int lb = b & 1;
               if (lb == 1)
                    ans *= f; // adding the power factor only if we got 1 in the binary
               f *= a; // accumulating the power factor everytime
               b >>= 1; // reducing the last bit
          }
          return ans;
     }

     static int xorzerotoa(int a) {
          int t = a % 4;
          if (t == 0)
               return a;
          else if (t == 1)
               return 1;
          else if (t == 2)
               return a + 1;
          return 0;
     }
}