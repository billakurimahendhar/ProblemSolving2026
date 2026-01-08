class Solution {
    public long findScore(int[] nums) {
        long ans=0;
        int n = nums.length;
        boolean[] x = new boolean[n];
        PriorityQueue<int []>pq=new PriorityQueue<>((a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        while(!pq.isEmpty()){
            int b[]=pq.poll();
            int curr=b[0],i=b[1];
            if(x[i])
            continue;
            ans+=curr;
            x[i]=true;
             if (i - 1 >= 0) x[i - 1] = true;
            if (i+ 1 < n) x[i + 1] = true;
        }
        return ans;
    }
}