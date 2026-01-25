class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arl = new ArrayList<>();
        Arrays.sort(nums);

        int k = nums[0];
        int i = 0;

        while (i < nums.length) {
            if (nums[i] == k) {
                k++;
                i++;
            } 
            else if (nums[i] > k) {
                arl.add(k);
                k++;
            } 
            else { 
                i++;
            }
        }
        return arl;
    }
}