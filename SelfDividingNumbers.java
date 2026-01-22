class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>arl=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int k=i;
            boolean flag=false;;
            while(k!=0){
                int m=k%10;
                k=k/10;
                if (m == 0 || i % m != 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
            arl.add(i);
        }
        return arl;
    }
}