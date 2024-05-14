import java.util.*;
//Leetcode - Unique Paths
/*
 * Intuition is simple:
 * When you are at any cell you can make only two moves => right or down
 * Do both moves and find out if we can lead to end using that move
 * Base case will be either the answer occured 
 * Other base case when we moved to an invalid row or column
 */
class Demo {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
          while (t-- > 0) {
               int a = sc.nextInt();
               int b = sc.nextInt();
               System.out.println(Math.min(a, b) + " " + Math.max(a, b));
          }
          System.out.println(getMazepaths(0,0,2,2));
     }
     private static List<String> getMazepaths(int cr,int cc, int dr,int dc) {
          ArrayList<String> path = new ArrayList<>();
          //base condition
          if (cr==dr && cc==dc){
               path.add("");
               return path;
          }
          if(cr>dr || cc>dc){
               return path;
          }
          List<String> horizontalMove = getMazepaths(cr,cc+1,dr,dc);
          List<String> verticalPaths = getMazepaths(cr+1,cc,dr,dc);
          for (String i : horizontalMove)
               path.add("h" + i);
          for (String i : verticalPaths)
               path.add("v" + i);
          return path;
     }
}
