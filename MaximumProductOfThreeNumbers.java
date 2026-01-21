class Solution {
    public int maximumProduct(int[] nums) {
         Arrays.sort(nums);
         int min1=nums[0];
         int min2=nums[1];
         int max1=nums[nums.length-1];
         int max2=nums[nums.length-2];
         int max3=nums[nums.length-3];
         int a=max1*max2*max3;
         int b=max1*min1*min2;
         return a>b?a:b;
    }
}