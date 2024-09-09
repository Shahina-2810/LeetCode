/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
       int[][] matrix = new int[m][];
        for (int i = 0; i < m; i++) {
            matrix[i] = new int [n];
            Arrays.fill(matrix[i], -1);
        }

        int topRow = 0, bottomRow = m - 1, leftCol = 0, rightCol = n - 1;
        while (head != null) {
        
            for (int col = leftCol; col <= rightCol && head != null; col++) {
                matrix[topRow][col] = head.val;
                head = head.next;
            }
            topRow++;

        
            for (int row = topRow; row <= bottomRow && head != null; row++) {
                matrix[row][rightCol] = head.val;
                head = head.next;
            }
            rightCol--;

 
            for (int col = rightCol; col >= leftCol && head != null; col--) {
                matrix[bottomRow][col] = head.val;
                head = head.next;
            }
            bottomRow--;

       
            for (int row = bottomRow; row >= topRow && head != null; row--) {
                matrix[row][leftCol] = head.val;
                head = head.next;
            }
            leftCol++;
        }

        return matrix; 
    }
}