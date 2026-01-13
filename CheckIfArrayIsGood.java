class Solution {
    public boolean isGood(int[] nums) {
        if(nums.length==1)
        return false;
        Arrays.sort(nums);
        int k=1;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1 && nums[i]==nums[i-1])
              return true;
              if(k==nums[i] && i<=nums.length-2){
              k++;
              continue;
              }else{
                return false;
              }
    
        }
        return true;
    }
}