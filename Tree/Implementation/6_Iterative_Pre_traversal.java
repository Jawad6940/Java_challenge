/* EXPLANATION:
    To convert an inherently recursive procedures to iterative, we need an explicit stack.
    Following is a simple stack based iterative process to print Preorder traversal.
    1) Create an empty stack s and push root node to stack.
    2) Do following while s is not empty.
        a) Pop an item from stack and print it.
        b) Push right child of popped item to stack
        c) Push left child of popped item to stack
    Right child is pushed before left child to make sure that left subtree is processed
    first.
*/


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
static void preOrder (TreeeNode root) {
    if (root == null)   return;

    Stack <TreeeNode> s=new Stack<>();
    s.push(root);

    while (!s.isEmpty()) {
        TreeeNode current = s.pop();
       System.out.print(current.val+" ");
        

        if (current.right!=null )
            s.push(current.right);
        if (current.left!=null)
            s.push(current.left);
    }
}

/* ---------------- MAIN DRIVER CODE ---------------- */
public static void main(String[] args) {
     /* Binary Tree constructed is:
            10
          /   \
        8      2
      /  \    /
    3     5  2
  */
  TreeeNode root = new TreeeNode(10);
  root.left        = new TreeeNode(8);
  root.right       = new TreeeNode(2);
  root.left.left  = new TreeeNode(3);
  root.left.right = new TreeeNode(5);
  root.right.left = new TreeeNode(2);
  preOrder(root);
}
}
