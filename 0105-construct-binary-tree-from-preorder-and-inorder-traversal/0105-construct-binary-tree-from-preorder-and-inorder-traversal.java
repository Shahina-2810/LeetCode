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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int preLow, int preHigh, int[] inorder, int inLow, int inHigh) {
        if (preLow > preHigh || inLow > inHigh) {
            return null;
        }

        // Create the root node with the current root value from preorder
        TreeNode root = new TreeNode(preorder[preLow]);

        if (preLow == preHigh) {
            return root; // If there's only one element, return the root
        }

        // Find the index of the root in the inorder array
        int rootIndex = inLow;
        while (rootIndex <= inHigh && inorder[rootIndex] != preorder[preLow]) {
            rootIndex++;
        }

        // Calculate the number of nodes in the left subtree
        int leftCount = rootIndex - inLow;

        // Recursively build the left and right subtrees
        root.left = build(preorder, preLow + 1, preLow + leftCount, inorder, inLow, rootIndex - 1);
        root.right = build(preorder, preLow + leftCount + 1, preHigh, inorder, rootIndex + 1, inHigh);

        return root;
       
    }
}