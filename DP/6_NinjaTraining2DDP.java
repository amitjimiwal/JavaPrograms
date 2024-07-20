import java.util.*;

class NinjaTraining{
    public static void main(String[] args) {
        int[][] tasks=new int[][]{{1,2,5},{3,1,1},{3,3,3}};
        int n=3;
        int[][] dp=new int[n][4];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i],-1);
        }
//        for(int i=0;i<3;i++){
//            if(i!=0) dp[0][0]=Math.max(dp[0][0],tasks[0][i]);
//            if(i!=1) dp[0][1]=Math.max(dp[0][1],tasks[0][i]);
//            if(i!=2) dp[0][2]=Math.max(dp[0][2],tasks[0][i]);
//        }
        System.out.println(Arrays.toString(dp[0]));
        System.out.println(recursive(n-1,3, tasks));
        System.out.println(memoizedDP(n-1,3, tasks,dp));
        System.out.println(tabulationDP(n,tasks));
    }

    static int recursive(int d, int t,int[][] task){
        if(d==0){
            //for the day 0 find out the max out of the all the tasks;
            int mxi=Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                if(i!=t) mxi=Math.max(mxi,task[0][i]);
            }
            return mxi;
        }
        /*
        * for a given day calculating the max merit by performing all the tasks except the previous day one */
        int mx=Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            if(i!=t) mx=Math.max(mx,task[d][i]+recursive(d-1,i,task));
        }
        return mx;
    }
    static int memoizedDP(int d, int t,int[][] task,int[][] dp){
        if(d==0){
            int mxi=Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                if(i!=t) mxi=Math.max(mxi,task[0][i]);
            }
            dp[d][t]=mxi;
            return dp[d][t];
        }
        if(dp[d][t]!=-1) return dp[d][t];

        int mx=Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            if(i!=t) {
                mx = Math.max(mx, task[d][i] + memoizedDP(d - 1, i, task, dp));
            }
        }
        dp[d][t]=mx;
        return dp[d][t];
    }
    static int tabulationDP(int n,int[][] tasks){
        int[][] dp=new int[n][4];
        for (int i = 0; i <n; i++) {
            Arrays.fill(dp[i],-1);
        }
        dp[0][0]=Math.max(tasks[0][1],tasks[0][2]);
        dp[0][1]=Math.max(tasks[0][0],tasks[0][2]);
        dp[0][2]=Math.max(tasks[0][0],tasks[0][1]);
        dp[0][3]=Math.max(tasks[0][0], Math.max(tasks[0][1],tasks[0][2]));
        for (int day = 1; day <n; day++) {
            for (int t = 0; t <=3; t++) {
                int mx=Integer.MIN_VALUE;
                dp[day][t]=0;
                for (int i = 0; i <3; i++) {
                    if(i!=t) {
                        mx = Math.max(mx, tasks[day][i] + dp[day - 1][i]);
                    }
                }
                dp[day][t]=mx;
            }
        }
        return dp[n-1][3];
    }
}