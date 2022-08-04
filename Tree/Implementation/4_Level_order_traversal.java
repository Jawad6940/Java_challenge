import java.util.*;

class TreeeNode {
    int val;
    TreeeNode left, right;

    public TreeeNode(int val) {
        this.val = val;
    }
}



/* ---------------- MAIN DRIVER CODE ---------------- */

 class Main {
    public static void main(String[] args) {
       
        TreeeNode root = new TreeeNode(1);
    root.left = new TreeeNode(2);
    root.right = new TreeeNode(3);
    root.left.left = new TreeeNode(4);
    root.left.right = new TreeeNode(5);

    System.out.println("Level Order traversal of binary tree is: "); 
    levelOrder(root);
    

    }
    // Main Logic
public static void levelOrder (TreeeNode  root) {
    // If the tree is empty, we can simply return
    if (root == null)   return;

    // If tree is not empty, we will need Queue
    Queue <TreeeNode > q=new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
        TreeeNode  current = q.poll();
       System.out.print(current.val+" ");

        if (current.left != null)
            q.add(current.left);
        if (current.right != null)
            q.add(current.right);
    }
}
}
