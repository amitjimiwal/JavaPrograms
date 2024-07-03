import java.util.*;

class  ClimbingStairs{
    public static void main(String[] args) {
        int n=4;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(memoizedDP(n,dp));
        System.out.println(tabulationDP(n));
        System.out.println(optimisedSpace(n));
    }
    static int memoizedDP(int n,int[] dp){
        if(n<=1) return 1;

        //check for overlapping subproblem
        if(dp[n]!=-1) return dp[n];

        //computing subproblem if it is not yet computed
        dp[n]=memoizedDP(n-1,dp)+memoizedDP(n-2,dp);
        return dp[n];
    }
    static int tabulationDP(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <=n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    static int optimisedSpace(int n){
        int p1=1;
        int p2=1;
        if(n<=1) return n;
        for (int i = 2; i <=n; i++) {
            int curr=p1+p2;
            p1=p2;
            p2=curr;
        }
        return p2;
    }
}