class Solution {
    public int[] constructRectangle(int area) {
        int a[]=new int [2];
        int i=1,j=area;
        while(j>=i){
            if((i*j)==area){
           a[0]=j;
           a[1]=i;
            }
           if((i*j)>=area)
           j--;
           else
           i++;

        }
        return a;
    }
}