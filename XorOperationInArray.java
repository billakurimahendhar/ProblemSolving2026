class Solution {
    public int xorOperation(int n, int start) {
        int i=0;
        for(int j=0;j<n;j++){
            i^=start+2*j;
        }
        return i;
    }
}