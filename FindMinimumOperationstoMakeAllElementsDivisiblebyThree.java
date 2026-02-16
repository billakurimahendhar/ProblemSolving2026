class Solution {
    public int minimumOperations(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){

            sum+=nums[i]%3!=0?1:0;
        }
        return sum;
    }
}