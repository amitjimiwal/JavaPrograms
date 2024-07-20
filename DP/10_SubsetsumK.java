import java.util.*;

class Solution {
    public static boolean canPartition(int[] arr, int n) {
        // Write your code here.
        int ts=0;
        for(int x:arr) ts+=x;
        if((ts&1)==1) return false;

        int[][] dp=new int[n][ts/2+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        // return fmemo(n-1,ts/2,arr,dp);
        return tabulation(n, ts/2, arr);
    }
    private static boolean f(int ind,int target,int[] arr){
        if(target==0) return true;

        if(ind==0) return arr[0]==target;

        boolean notpick=f(ind-1, target, arr);
        boolean pick=false;

        if(!notpick && target>=arr[ind]) pick=f(ind-1, target-arr[ind], arr);

        return pick || notpick;
    }
    private static boolean fmemo(int ind,int target,int[] arr,int[][] dp){
        if(target==0) return true;
        if(ind==0) return arr[0]==target;

        if(dp[ind][target]!=-1) return dp[ind][target]==1 ? true:false;
        boolean notpick=fmemo(ind-1, target, arr,dp);
        boolean pick=false;
        if(!notpick && target>=arr[ind]) pick=fmemo(ind-1, target-arr[ind], arr,dp);
        dp[ind][target]= (pick || notpick) ? 1:0;
        return pick || notpick;
    }

    private static boolean tabulation(int n, int target,int[] arr){
        boolean[][] dp=new boolean[n][target+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=true;
        }
        dp[0][arr[0]]=true;

        for (int ind = 1; ind < n; ind++) {
            for (int tar = 1; tar<=target; tar++) {
                boolean notpick=dp[ind-1][tar];
                boolean pick=false;
                if(!notpick && tar>=arr[ind]) pick=dp[ind-1][tar-arr[ind]];

                dp[ind][tar]=pick || notpick;
            }
        }
        return dp[n-1][target];
    }


}