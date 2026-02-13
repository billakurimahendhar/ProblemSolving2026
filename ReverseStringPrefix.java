class Solution {
    public String reversePrefix(String s, int k) {
        String st1=s.substring(0,k);
        String st2=s.substring(k);
        for(int i=0;i<k;i++)
        st2=st1.charAt(i)+st2;
        return st2;

    }
}