class Solution {
    public int findCenter(int[][] edges) {
        int a=edges[0][0];
        int b=edges[0][1];
        int c=edges[1][0];
        int d=edges[1][1];
        return a==b?a:a==c?a:a==d?a:b==c?b:b==d?b:c==d?c:d;
    }
}