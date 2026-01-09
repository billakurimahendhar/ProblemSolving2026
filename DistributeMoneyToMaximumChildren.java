class Solution {
    boolean valid(int m,int mo,int ch){
        int c=mo-ch;
        c-=m*7;
        int rch=ch-m;
       if(c<0)
       return false;
       if (rch == 0 && c != 0) return false;

       if(rch==1 && c==3)
       return  false;
       return true;
    }
    public int distMoney(int money, int children) {
        if(money<children)
        return -1;
       int f=0,l=children;
       int ans=-1;
       while(f<=l){
        int m=(f+l)/2;
        if(valid(m,money,children))
        {
            ans=m;
            f=m+1;
        }
        else{
        l=m-1;
        }
       }
       return ans;
    }
}