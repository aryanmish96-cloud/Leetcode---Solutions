class Solution {
    static int[] dp;

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min( minCost(0,cost),minCost(1,cost));
    }
    static int minCost(int i , int[]arr){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i] =  arr[i] + Math.min(minCost(i+1,arr),minCost(i+2,arr));

    }
}