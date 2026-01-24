class Solution {
    public boolean judgeSquareSum(int c) {
        long a=(int)Math.sqrt(c);
        long b=0;
        while(b<=a){
            if((a*a+b*b)==c){
               return true;
            }else if((a*a+b*b)>c){
                a--;

            }else{
                b++;
            }
        }
        return false;
    }
}