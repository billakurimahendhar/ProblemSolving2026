import java.util.HashMap;
class Solution
{
    public boolean checkPrimeFrequency(int[] nums)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int j = 0; j < nums.length; j++)
        {
            if(prime(map.get(nums[j])))
            {
                return true;
            }
        }
        return false;
    }
    private boolean prime(int n)
    {
        if(n <= 1) return false;
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}