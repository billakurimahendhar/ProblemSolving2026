class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<=j){
          if(s.charAt(i)!=s.charAt(j)){
            return f(s,i+1,j)||f(s,i,j-1);
          }
          i++;
          j--;
        }
        return  true;
    }
    boolean f(String s,int l, int r){
         while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}