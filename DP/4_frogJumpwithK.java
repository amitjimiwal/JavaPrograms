import java.util.*;

class FrogJumpK{
    public static void main(String[] args) {
        int n=5;
        int k=3;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int[] h=new int[]{10,30,40,50,20};
        System.out.println(memoizedDP(n-1,k,dp,h));
        System.out.println(tabulationDP(n-1,k,h));
    }

    static int memoizedDP(int n,int k,int[] dp,int[] h){
        if(n==0) return 0;
        if(n==1) return Math.abs(h[1]-h[0]);

        if(dp[n]!=-1) return dp[n];

        int minEn=Integer.MAX_VALUE;
        for (int i = 1 ; i <=k; i++) {
            if(n-i>=0) minEn=Math.min(minEn,memoizedDP(n-i,k,dp,h)+Math.abs(h[n]-h[n-i]));
        }
        dp[n]=minEn;
        return dp[n];
    }
    static int tabulationDP(int n,int k,int[] h){
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        dp[0]=0;
        dp[1]=Math.abs(h[1]-h[0]);

        for (int j = 2; j<=n; j++) {
            int minEn = Integer.MAX_VALUE;
            for (int i = 1; i <= k; i++) {
                if (j - i >= 0) minEn = Math.min(minEn, dp[j - i] + Math.abs(h[j] - h[j - i]));
            }
            dp[j] = minEn;
        }
        return dp[n];
    }
}