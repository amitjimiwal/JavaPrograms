import java.util.*;

class MaxSumAdjacentSubsequence{
    public static void main(String[] args) {
        ArrayList<Integer> other=new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            other.add(i+1);
        }
        int[] dp=new int[5];
        Arrays.fill(dp,-1);
        System.out.println(getMaxSumRecursive(3,other));;
        System.out.println(memoizedDP(3,other,dp));
        System.out.println(tabulationDP(3,other));
        System.out.println(spaceOptimised(3,other));
    }
    static int getMaxSumRecursive(int n,ArrayList<Integer> ls){
        if(n==0) return ls.get(n);
        if(n<0) return 0;

        int pick=ls.get(n)+getMaxSumRecursive(n-2,ls);
        int notpick=getMaxSumRecursive(n-1,ls);

        return Math.max(pick,notpick);
    }
    static int memoizedDP(int n,ArrayList<Integer> ls,int[] dp){
        if(n==0) return ls.get(n);
        if(n<0) return 0;

        if(dp[n+1]!=-1) return dp[n+1];
        int pick=ls.get(n)+memoizedDP(n-2,ls,dp);
        int notpick=memoizedDP(n-1,ls,dp);
        dp[n+1]=Math.max(pick,notpick);
        return dp[n+1];
    }
    static int tabulationDP(int n,ArrayList<Integer> ls){
        int[] dp=new int[5];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=ls.get(0);

        for(int i=1;i<=n;i++){
            dp[i+1]=Math.max(dp[i-1]+ls.get(i),dp[i]);
        }
        return dp[n+1];
    }
    static int spaceOptimised(int n,ArrayList<Integer> ls){
        int[] dp=new int[5];
        Arrays.fill(dp,-1);
        int p1=0;
        int p2=ls.get(0);

        for(int i=1;i<=n;i++){
            int curr=Math.max(p1+ls.get(i),p2);
            p1=p2;
            p2=curr;
        }
        return p2;
    }

}