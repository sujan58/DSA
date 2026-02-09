class Solution {
    public int climbStairs(int n) {
        // if(n<=1){
        //     return n;
        // }
        // int[] dp = new int[n];
        // dp[0]=1;
        // dp[1]=2;
        // for(int i=2;i<n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(dp[i]+" ");
        // }
        // return dp[n-1];
        if(n<=1){
            return n;
        }
        int step_1=1;
        int step_2=2;
        for(int i=2;i<n;i++){
            int temp=step_1+step_2;
            step_1=step_2;
            step_2=temp;
        }
        return step_2;
    }
}