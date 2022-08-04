import java.util.*;

class TreeNode{
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class Insertion_of_Node{


    /* PROBLEM: Given a binary tree and a key, insert the key into the binary tree
            at first position available in level order.
    APPROACH:
    The idea is to do iterative level order traversal of the given tree using queue.
    If we find a node whose left child is empty, we make new key as left child of the node.
    Else if we find a node whose right child is empty, we make new key as right child.
    We keep traversing the tree until we find a node whose either left or right is empty.
*/

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
    root.left = new TreeNode(11);
    root.left.right = new TreeNode(7);
    root.right = new TreeNode(9);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(8);

    System.out.println(

        "Level order traversal before insertion:"
    );
    levelOrder(root);

    int key = 12;
    insertNode(root, key);
    insertNode(root, 13);
    insertNode(root, 14);


   
    System.out.println("\nLevel order traversal after insertion:"); 
    levelOrder(root);

    }
    public static void levelOrder (TreeNode  root) {
        // If the tree is empty, we can simply return
        if (root == null)   return;
    
        // If tree is not empty, we will need Queue
        Queue <TreeNode > q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode  current = q.poll();
           System.out.print(current.val+" ");
    
            if (current.left != null)
                q.add(current.left);
            if (current.right != null)
                q.add(current.right);
        }
    }
    public static void insertNode (TreeNode  root, int key) {
        // If the tree is empty, we can simply return
        if (root == null)  { root= new TreeNode(key);
        
        return;}
    
        // If tree is not empty, we will need Queue
        Queue <TreeNode > q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode  current = q.poll();
          
    
            if (current.left != null)
                q.add(current.left);
            else{
                current.left=new TreeNode(key);
                return;
             }   
            if (current.right != null)
                q.add(current.right);
               else{
                    current.right=new TreeNode(key);
                    return;
                 }
        }
    }
}