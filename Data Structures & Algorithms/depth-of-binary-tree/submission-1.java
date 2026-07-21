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
    public int maxDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        Queue<TreeNode> s=new LinkedList<>();
        s.offer(root);
        int count=0;
        
        while(!s.isEmpty())
        {
            int size=s.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp=s.remove();
                if(temp.right!=null)
                {
                    s.offer(temp.right);
                }
                if(temp.left!=null)
                {
                    s.offer(temp.left);
                }
            }
            count++;
        }
        return count;
    }
}
