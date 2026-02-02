class Solution {
    public boolean predictTheWinner(int[] nums) {
       return f(nums,0,nums.length-1)>=0;
    }
    public int f(int nums[],int i,int j){
        if(i==j)
        return nums[i];
        return Math.max(nums[i]-f(nums,i+1,j),nums[j]-f(nums,i,j-1));
    
    }
}