class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
       boolean s12=true;
       boolean s21=true;
       char a[]=s1.toCharArray();
       char b[]=s2.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       for(int i=0;i<a.length;i++){
        if(a[i]<b[i])
        s12=false;
        if(b[i]<a[i])
        s21=false;
       }
       return s12||s21;
    }
}