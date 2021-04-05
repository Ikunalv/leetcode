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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        inorder(root,list);
        TreeNode ans = new TreeNode(0),curr = ans;
        for(int i:list){
            curr.right = new TreeNode(i);
            curr = curr.right;
        }
        
        return ans.right;
    }
    
    public void inorder(TreeNode curr, List<Integer> list){
        if(curr == null)
             return;
        inorder(curr.left,list);
        list.add(curr.val);
        inorder(curr.right,list);
    }
}