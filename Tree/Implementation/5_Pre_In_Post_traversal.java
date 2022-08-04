
import java.util.*;



class TreeeNode {
    int val;
    TreeeNode left, right;

    public TreeeNode(int val) {
        this.val = val;
    }
}

class Main {
    // Main Logic
static void preOrder (TreeeNode node) {
    if (node == null) return;
    System.out.print( node.val+" ");
    preOrder (node.left);
    preOrder (node.right);
}

static void inOrder (TreeeNode node) {
    if (node == null) return;
    inOrder(node.left);
    System.out.print( node.val+" ");
    inOrder(node.right);
}

static void postOrder (TreeeNode node) {
    if (node == null)   return;
    postOrder(node.left);
    postOrder(node.right);
    System.out.print( node.val+" ");
}
public static void main(String[] args) {
    
     TreeeNode root = new TreeeNode (1);
    root.left        = new TreeeNode (2);
    root.right       = new TreeeNode (3);
    root.left.left  = new TreeeNode (4);
    root.left.right = new TreeeNode (5);

    System.out.println("\nPreorder traversal of binary tree is \n"); 
    preOrder(root);

    System.out.println("\nInorder traversal of binary tree is \n"); 
    inOrder(root);

    System.out.println("\nPostorder traversal of binary tree is \n"); 
    postOrder(root);

}
}
