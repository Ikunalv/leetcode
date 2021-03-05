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
    List<TreeNode> l = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        store(root);
        int n = l.size();
        return build(0, n -1);
    }
    private void store(TreeNode node) {
        if (node == null) return;
        store(node.left);
        l.add(node);
        store(node.right);
    }
    
    private TreeNode build(int st, int end) {
        if (st > end) return null;
        int mid = (st + end) / 2;
        TreeNode root = l.get(mid);
        root.left = build(st, mid - 1);
        root.right = build(mid + 1, end);
        return root;
    }
}