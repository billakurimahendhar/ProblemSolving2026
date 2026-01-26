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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode>map=new HashMap<>();
        HashSet<Integer>set=new HashSet<>();
        for(int des[]:descriptions){
            int pa=des[0];
            int ch=des[1];
            int il=des[2];
            map.putIfAbsent(pa,new TreeNode(pa));
            map.putIfAbsent(ch,new TreeNode(ch));
            if (il== 1) {
            map.get(pa).left = map.get(ch);
            } else {
            map.get(pa).right = map.get(ch);
            }
            set.add(ch);
        }
        for(int i:map.keySet()){
            if (!set.contains(i)) {
            return map.get(i);
        }
        return null;
        }
    }
}