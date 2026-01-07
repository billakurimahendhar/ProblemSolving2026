class Solution {
    public int countDigitOne(int n) {
        int ans=0;
        for(long pos=1;pos<=n;pos=pos*10) {
              long hi=n/(pos*10);
              long curr=(n/pos)%10;
              long lw=n%pos;
              if(curr==0)
                ans+=hi*pos;
                else if(curr==1)
                ans+=hi*pos+lw+1;
                else
                ans+=(hi+1)*pos;


              
        } 
        return ans;
     }
}