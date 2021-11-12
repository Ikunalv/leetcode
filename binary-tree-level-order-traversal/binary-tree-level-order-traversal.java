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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int level = 0;
        q.add(root);
        while(!q.isEmpty()){
            int nodesOnLevel = q.size();
            if(levels.size()==level){
                levels.add(new ArrayList<Integer>());
            }
            for(int i=0;i<nodesOnLevel;i++){
                TreeNode currentNode = q.remove();
                levels.get(level).add(currentNode.val);
                if(currentNode.left!=null)
                    q.add(currentNode.left);
                if(currentNode.right!=null)
                    q.add(currentNode.right);
                
            } 
            level++;
        }
        return levels;
    }
}