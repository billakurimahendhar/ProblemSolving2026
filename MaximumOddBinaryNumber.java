class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones=0,zeroes=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
            ones++;
            else
            zeroes++;
        }
        String st="";
        st+=1+"";
        ones--;
        while(zeroes>0)
        {
            st="0"+st;
            zeroes--;
        }
        while(ones>0)
        {
            st="1"+st;
            ones--;
        }
        return st;
    }
}