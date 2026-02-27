class Solution {
    public int countKeyChanges(String s) {
      String st=s.toLowerCase();
      int c=0;
        for(int i=1;i<st.length();i++){
              if(st.charAt(i-1)!=st.charAt(i))
              c++;


        }
        return c;
    }
}