class Solution {
    boolean palindrome(String s){
        int l=0,r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r))
            return false;
            l++;
            r--;
        }
        return true;
    }
    public void f(List<String>arl,List<List<String>>drl,int start,String s){
        if(start==s.length())
        {
            drl.add(new ArrayList<>(arl));
            return;
        }
         for(int i=start;i<s.length();i++){
            String st=s.substring(start,i+1);
            if(palindrome(st)){
            arl.add(st);
            f(arl,drl,i+1,s);
            arl.remove(arl.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>drl=new ArrayList<>();
        List<String>arl=new ArrayList<>();
        f(arl,drl,0,s);
        return drl;
    }
}