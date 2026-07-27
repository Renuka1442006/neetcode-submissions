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
    public int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
         return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
          if(root==null)
          {
            return 0;
          }
          int maxi=0;
        TreeNode temp=root;
        while(temp!=null)
        {
            int leftheight=height(temp.left);
            int rightheight=height(temp.right);
            maxi=Math.max(maxi,leftheight+rightheight);
            if(temp.left!=null)
            {
                temp=temp.left;
            }
            else
            {
                temp=temp.right;
            }
        }
        return maxi;
    }
}
