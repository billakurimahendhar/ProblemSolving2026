/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxdepth=0;
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        depth(root,0);
        findSum(root,0);
        return sum;
    }
   void depth(TreeNode root,int d){
    if(root==null)
    return ;
    maxdepth=Math.max(maxdepth,d);
    depth(root.left,d+1);
    depth(root.right,d+1);
   }
   void findSum(TreeNode root,int d){
    if(root==null)
    return;
    if(d==maxdepth)
    sum+=root.val;
    findSum(root.left,d+1);
    findSum(root.right,d+1);
   }
}