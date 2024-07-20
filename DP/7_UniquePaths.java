import java.util.*;

class GridUniquePaths{
    public static void main(String[] args) {
        int m=3;
        int n=7;
        int[][] dp=new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i],-1);
        }
        System.out.println(memoizedDP(m-1,n-1,dp));
        System.out.println(tabulationDP(m,n));
    }

    static int memoizedDP(int m,int n,int[][] dp){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0) return 0;

        if(dp[m][n]!=-1) return dp[m][n];

        int l=memoizedDP(m,n-1,dp);
        int u=memoizedDP(m-1,n,dp);
        dp[m][n]=l+u;
        return dp[m][n];
    }
    static int tabulationDP(int m,int n){
        int[][] dp=new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i],-1);
        }
        dp[0][0]=1;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(dp[r][c]==-1){
                    dp[r][c]++;
                    //if possible move to move up
                    if(r-1>=0){
                        dp[r][c]+=dp[r-1][c];
                    }
                    //if possible move to move down
                    if(c-1>=0){
                        dp[r][c]+=dp[r][c-1];
                    }
                }
            }
        }
        return dp[m-1][n-1];
    }
    static int spaceOptimisedDP(){

        return 0;
    }
}