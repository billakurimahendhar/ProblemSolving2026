class Solution {
    public int minimumDistance(int[] nums) {
         HashMap<Integer,List<Integer>>map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<Integer>());
            map.get(nums[i]).add(i);
            if(map.get(nums[i]).size()==3){
               int a=map.get(nums[i]).get(0);
               int b=map.get(nums[i]).get(1);
               int c=map.get(nums[i]).get(2);
               min=Math.min(min,Math.abs(a-b)+Math.abs(a-c)+Math.abs(b-c));
               map.get(nums[i]).remove(0);
            }
        }
            return min==Integer.MAX_VALUE?-1:min;
    }
}