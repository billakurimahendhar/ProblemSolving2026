class Solution {
    public long rob(int[] nums, int[] colors) {
        long dp[]=new long[nums.length];
        if(nums.length==1)
        return nums[0];
        dp[0]=nums[0];
        dp[1]=colors[0]==colors[1]?Math.max(dp[0],nums[1]):dp[0]+nums[1];
        for(int i=2;i<nums.length;i++){
            dp[i]=colors[i]==colors[i-1]?Math.max(dp[i-1],dp[i-2]+nums[i]):nums[i]+dp[i-1];
        }
        return Math.max(dp[nums.length-1],dp[nums.length-2]);
    }
}