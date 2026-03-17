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
    void f(TreeNode root,List<Integer>arl,String st){
        if(root==null)
        return;
        if(root.left==null && root.right==null){
            String st1=st+root.val;
            arl.add(Integer.valueOf(st1));
            return;
        }
        f(root.left,arl,st+root.val);
        f(root.right,arl,st+root.val);
    }
    public int sumNumbers(TreeNode root) {
        List<Integer>arl=new ArrayList<>();
        f(root,arl,"");
        int sum=0;
        for(int i=0;i<arl.size();i++)
        sum+=arl.get(i);
        return sum;
    }
}