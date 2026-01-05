class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int c=0;
        long sum=0;
        for(int i=happiness.length-1;i>=happiness.length-k;i--){
            sum+=happiness[i]-c>=0?happiness[i]-c:0;
            c++;
        }
        return sum;
    }
}