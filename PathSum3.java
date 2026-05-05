class Solution {
    int count = 0;

    void f(List<Integer> arl, TreeNode root, int target) {
        if (root == null) return;

        arl.add(root.val);

        long sum = 0;
        for (int i = arl.size() - 1; i >= 0; i--) {
            sum += arl.get(i);
            if (sum == target) count++;
        }

        f(arl, root.left, target);
        f(arl, root.right, target);

        arl.remove(arl.size() - 1);
    }

    public int pathSum(TreeNode root, int targetSum) {
        f(new ArrayList<>(), root, targetSum);
        return count;
    }
}