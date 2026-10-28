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
    public int heightTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int lefts=heightTree(root.left);
        int rights=heightTree(root.right);
        return Math.max(lefts,rights)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int h1=heightTree(root.left)+heightTree(root.right);
        int h2=diameterOfBinaryTree(root.left);
        int h3=diameterOfBinaryTree(root.right);
        
        return Math.max(h1,Math.max(h2,h3));
    }
}