
/* ALGORITHM:
    1) Initialize current node as root
    2) Create an empty stack S.
    3) Push the current node to S and set current = current->left until current is NULL
    4) If current is NULL and stack is not empty then
        a) Pop the top item from stack.
        b) Print the popped item, set current = popped_item->right
        c) Go to step 3.
    5) If current is NULL and stack is empty then we are done.
*/
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
    }
}

class Main {
    // Main Logic
    static void inOrder(TreeNode root) {
        if(root==null) return;
        Stack <TreeNode> st = new Stack<>();
        while(root!=null||!st.isEmpty()){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            root=st.pop();
            System.out.println(root.val);
            root=root.right;
        }

    }

    public static void main(String[] args) {
        /* Constructed binary tree is:
              1
            /   \
          2      3
        /  \      \
      4     5      6
    */
   TreeNode root = new TreeNode(1);
    root.left        = new TreeNode(2);
    root.right       = new TreeNode(3);
    root.left.left  = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(6);

    inOrder(root);
    }

}