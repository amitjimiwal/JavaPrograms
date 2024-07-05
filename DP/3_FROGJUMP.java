import  java.util.*;
class  FrogJump{
    public static void main(String[] args) {
        int n=5;
        int[] h=new int[]{10,20,30,10,60};
        int[] dp=new int[n];
        Arrays.fill(dp, -1);
        System.out.println(memoiZedDP(n-1,h,dp));
        System.out.println(tabulationDP(n-1,h));
        System.out.println(optimisedSpace(n-1,h));
    }
    static int memoiZedDP(int n,int[] h,int[] dp){
        if(n==0) return 0;
        if(n==1) return Math.abs(h[1]-h[0]);

        if(dp[n]!=-1) return dp[n];
        int one=memoiZedDP(n-1, h,dp)+Math.abs(h[n]-h[n-1]);
        int two=memoiZedDP(n-2, h,dp)+Math.abs(h[n]-h[n-2]);
        dp[n]=Math.min(one,two);
        return dp[n];
    }
    private static int tabulationDP(int n, int[] h) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=Math.abs(h[1]-h[0]);
        for (int i = 2; i <=n ; i++) {
            dp[i]=Math.min(dp[i-1]+Math.abs(h[i]-h[i-1]),dp[i-2]+Math.abs(h[i]-h[i-2]));
        }
        return dp[n];
    }
    private static int optimisedSpace(int n, int[] h) {
        int[] dp=new int[n+1];
        int p1=0;
       int p2=Math.abs(h[1]-h[0]);
        for (int i = 2; i <=n ; i++) {
            int curr=Math.min(p2+Math.abs(h[i]-h[i-1]),p1+Math.abs(h[i]-h[i-2]));
            p1=p2;
            p2=curr;
        }
        return p2;
    }
}