class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int pre[]=new int[nums.length];
        int suf[]=new int[nums.length];
        int result[]=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        pre[i]=pre[i-1]+nums[i];
        suf[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        suf[i]=suf[i+1]+nums[i];
        for(int i=0;i<nums.length;i++){
            int pres=i-1==-1?0:pre[i-1];
            int sufs=i+1==nums.length?0:suf[i+1];
            if(i-1 == -1)
            result[i]=Math.abs((((nums.length-i-1)*nums[i]) -sufs));
            else if(i+1 == nums.length){
                result[i]=((i*nums[i])-pres);
            }
            else{
                result[i]=((i*nums[i])-pres)+Math.abs((((nums.length-i-1)*nums[i]) -sufs));
            }

        }
        return result;
    }
}