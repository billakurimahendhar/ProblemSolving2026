class Solution {
    private boolean isValid(int[] houses, int[] heaters, int radius) {
        int n=heaters.length,m=houses.length;
        int i=0,j=0;
        while(i<m && j<n){
            if(Math.abs(houses[i]-heaters[j])<=radius)
            i++;
            else
            j++;
        }
        return i==m;
    }
    public int findRadius(int[] houses,int[] heaters) {
        
        int l=0,h=1000000000;
        int min=h;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        while(l<=h){
            int m=l+(h-l)/2;
            if(isValid(houses,heaters,m)){
               min=m;
               h=m-1;
            }else{
                l=m+1;
            }
        }
        return min;
    }
}