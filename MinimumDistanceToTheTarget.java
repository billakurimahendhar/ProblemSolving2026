class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=nums[i]==target?Math.min(min,Math.abs(i-start)):min;
        }
        return min;
    }
}