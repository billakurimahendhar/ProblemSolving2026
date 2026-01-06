class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
         long[] ans = new long[queries.length];
         int fh=(intLength+1)/2;
          long start = (long) Math.pow(10, fh - 1);
          long end = (long) Math.pow(10, fh);
          for(int i=0;i<queries.length;i++){
            long k = queries[i];
            long firstHalf = start + k - 1;

            if (firstHalf >= end) {
                ans[i] = -1;
                continue;
            }
             String s = Long.toString(firstHalf);
            StringBuilder sb = new StringBuilder(s);

        
            if (intLength % 2 == 1) {
                sb.deleteCharAt(sb.length() - 1);
            }

            sb.append(new StringBuilder(s).reverse());
            ans[i] = Long.parseLong(sb.toString());
          }
          return ans;
    }
}