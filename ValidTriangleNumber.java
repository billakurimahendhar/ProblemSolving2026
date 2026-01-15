class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1;i>=2;i--){
            int p=0,q=i-1;
            while(p<q){
                if(nums[p]+nums[q]>nums[i]){
                    count+=(q-p);
                 q--;
                }else
                {
                    p++;
                }
            }
        }
        return count;
    }
}