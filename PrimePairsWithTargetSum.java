class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
         boolean a[]  = new boolean[n + 1];
        Arrays.fill(a, true);

        if (n >= 0) a[0] = false;
        if (n >= 1) a[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (a[i]) {
                for (int j = i * i; j <= n; j += i) {
                    a[j] = false;
                }
            }
        }
        List<List<Integer>>arl=new ArrayList<>();
        for(int i=2;i<=n/2;i++){
            if(a[i]&&a[n-i])
            {
               ArrayList<Integer> temp = new ArrayList<>();
               temp.add(i);
               temp.add(n - i);
               arl.add(temp);
            }
        }
        return arl;
    }
}