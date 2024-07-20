import java.util.*;
 class TrianglePathSum{
     public static void main(String[] args) {
         List<List<Integer>> triangle = new ArrayList<>();
         int r = triangle.size();
         // return recursive(0,0,triangle);
         List<List<Integer>> dp = new ArrayList<>();
         for (int i = 0; i < r; i++) {
             ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(triangle.get(i).size(), -1));
             dp.add(row);
         }
         System.out.println(memo(0,0,triangle,dp));
     }
     static int recursive(int cr, int cc, List<List<Integer>> triangle) {
         if (cr == triangle.size() - 1) return triangle.get(cr).get(cc);
         int min = Integer.MAX_VALUE;
         for (int i = 0; i <= cc; i++) {
             min = Math.min(min, triangle.get(cr).get(cc) + recursive(cr + 1, cc, triangle));
             min = Math.min(min, triangle.get(cr).get(cc) + recursive(cr + 1, cc + 1, triangle));
         }
         return min;
     }

     static int memo(int cr, int cc, List<List<Integer>> triangle, List<List<Integer>> dp) {
         if (cr == triangle.size() - 1) return triangle.get(cr).get(cc);

         if (dp.get(cr).get(cc) != -1) return dp.get(cr).get(cc);
         int min = Integer.MAX_VALUE;
         for (int i = 0; i <= cc; i++) {
             min = Math.min(min, triangle.get(cr).get(cc) + memo(cr + 1, cc, triangle, dp));
             min = Math.min(min, triangle.get(cr).get(cc) + memo(cr + 1, cc + 1, triangle, dp));
         }
         dp.get(cr).set(cc,min);
         return min;
     }

     static int tabulation(List<List<Integer>> triangle) {
         int n=triangle.size();
         int[][] dp=new int[n][n];
         for(int i=0;i<n;i++){
             Arrays.fill(dp[i],-1);
         }
         for(int i=0;i<n;i++){
             dp[n-1][i]=triangle.get(n-1).get(i);
         }

         for (int i = n-2; i>=0; i--) {
             for (int j = 0; j <=i; j++) {
                 dp[i][j]=Math.min(dp[i+1][j]+triangle.get(i).get(j),dp[i+1][j+1]+triangle.get(i).get(j));
             }
         }
         return dp[0][0];
     }

     private static int spaceOptimised(){
         return 0;
     }
 }