import java.util.*;

class MinimumPathSum{
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int[][] dp=new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i],-1);
        }
        int[][] grid=new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(memoizedDP(m-1,n-1,grid,dp));
        System.out.println(tabulationDP(grid));
        System.out.println(spaceOptimisedDP(grid));
    }

    static int memoizedDP(int m,int n,int[][] grid,int[][] dp){
        if(m==0 && n==0){
            return grid[0][0];
        }
        if(m<0 || n<0) return 10000;

        if(dp[m][n]!=-1) return dp[m][n];

        int l=grid[m][n]+memoizedDP(m,n-1,grid,dp);
        int u=grid[m][n]+memoizedDP(m-1,n,grid,dp);
        dp[m][n]=Math.min(l,u);
        return dp[m][n];
    }
    static int tabulationDP(int[][]grid){
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i],-1);
        }
        dp[0][0]=grid[0][0];
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(dp[r][c]==-1){
                    dp[r][c]++;
                    int xc=grid[r][c];
                    int yc=grid[r][c];
                    if(r-1>=0){
                        xc+=dp[r-1][c];
                    }else xc+=100000;

                    if(c-1>=0){
                        yc+=dp[r][c-1];
                    }else yc+=100000;
                    dp[r][c]=Math.min(xc,yc);
                }
            }
        }
        return dp[m-1][n-1];
    }
    static int spaceOptimisedDP(int[][]grid){
        int m=grid.length;
        int n=grid[0].length;
        int[] prev=new int[n];
        Arrays.fill(prev,-1);

        for (int i = 0; i < m; i++) {
            int[] curr=new int[n];
            Arrays.fill(curr,-1);
            for (int j = 0; j < n; j++) {
                if(i==0 && j==0) curr[j]=grid[i][j];

                if(curr[j]==-1){
                    curr[j]++;
                    int xc=grid[i][j];
                    int yc=grid[i][j];

                    if(i-1>=0) xc+=prev[i-1];
                    else xc+=100000;

                    if(j-1>=0) yc+=curr[j-1];
                    else yc+=100000;

                    curr[j]=Math.min(xc,yc);
                }
            }
            prev=curr;
        }
        return prev[n-1];
    }
}