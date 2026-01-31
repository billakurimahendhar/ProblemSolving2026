import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) freq.put(n, freq.getOrDefault(n, 0) + 1);

        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) arr[i] = nums[i];

        Arrays.sort(arr, (a, b) -> 
            !freq.get(a).equals(freq.get(b)) 
                ? freq.get(a) - freq.get(b) 
                : b - a
        );

        for (int i = 0; i < nums.length; i++) nums[i] = arr[i];
        return nums;
    }
}
