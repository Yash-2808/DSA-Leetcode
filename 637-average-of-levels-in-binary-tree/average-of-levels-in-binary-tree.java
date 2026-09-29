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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> li=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            double avg=0;

            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                avg+=curr.val;

                if(curr.left!=null){
                    q.add(curr.left);

                }if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            avg=avg/size;
            li.add(avg);
        }
        return li;
    }
}