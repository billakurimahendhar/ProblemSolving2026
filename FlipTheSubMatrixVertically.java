class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int i1=x,i2=x+k-1;
        int j1=y,j2=y+k-1;
        while(i1<=i2){
            for(int z=j1;z<=j2;z++){
                int temp=grid[i1][z];
                grid[i1][z]=grid[i2][z];
                grid[i2][z]=temp;
            }
            i1++;
            i2--;
        }
    return grid;
    }
}