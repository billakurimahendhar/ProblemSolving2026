class Solution {
    public int arrangeCoins(int n) {
        int k=1;
        int sum=0;
        while(true){
            sum++;
            n-=k;
            k++;
            if(n<k)
            break;

        }
        return sum;
    }
}