class Solution {
    public int[] shortestToChar(String s, char c) {
        int a[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int len1=Integer.MAX_VALUE;
            int len2=Integer.MAX_VALUE;
            for(int j=i;j>=0;j--){
                if(s.charAt(j)==c){
                    len1=i-j;
                    break;
                }
            }
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)==c){
                    len2=j-i;
                    break;
                }
            }
            a[i]=Math.min(len1,len2);
        }
        return a;
    }
}