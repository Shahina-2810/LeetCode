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
    public boolean isBalanced(TreeNode root) {
        if (root == null)  return true;
		if (Balanced_Height(root) == -1)  return false;
		return true;
	}
	public int Balanced_Height(TreeNode root) {
        if (root == null)  return 0;
        int left_Height = Balanced_Height(root.left);
        int right_Height = Balanced_Height(root.right);
        if (left_Height == -1 || right_Height == -1)  return -1;
        if (Math.abs(left_Height - right_Height) > 1)  return -1;
        return Math.max(left_Height, right_Height) + 1; 
    }
}