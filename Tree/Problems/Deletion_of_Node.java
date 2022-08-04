/* PROBLEM: Given a binary tree, delete a node from it by making sure that tree
            shrinks from the bottom (i.e. the deleted node is replaced by bottommost
            and rightmost node).
    Delete 10 in below tree:
           10
         /    \
        20     30
    Output:
           30
         /
        20
    Delete 20 in below tree:
           10
         /    \
        20     30
                \
                40
    Output :
           10
         /   \
        40    30
    APPROACH:
        1. Starting at root, find the deepest and rightmost node in binary tree and node
            which we want to delete.
        2. Replace the deepest rightmost node’s data with node to be deleted.
        3. Then delete the deepest rightmost node.
    Note:
        We can also replace node’s data that is to be deleted with any node whose
        left and right child points to NULL but we only use deepest node in order to maintain
        the balance of a binary tree.
*/

import java.util.*;

class TreeNode{
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val=val;
    }
}

public class Deletion_of_Node {
    
}
