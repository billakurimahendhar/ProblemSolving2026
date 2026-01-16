class Solution {
    public int minFlips(String target) {
        int c=0;
        for(int i=0;i<target.length()-1;i++){
            if(target.charAt(i)=='1'  && target.charAt(i+1)=='0')
            c++;
            if(target.charAt(i)=='0'  && target.charAt(i+1)=='1')
            c++;
        }
        if (target.charAt(0) == '1') {
            c++;
        }
        return c;
    }
}