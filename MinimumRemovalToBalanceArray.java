import java.util.*;

class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int maxWindow = 0;

        for (int right = 0; right < n; right++) {
            while ((long) nums[right] > (long) k * nums[left]) {
                left++;  
            }
            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        return n - maxWindow;
    }
}
