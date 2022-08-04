/* ALGORITHM:
    a) Method 1 - Using Two Stacks
        1. Push root to auxiliary stack.
        2. Loop while auxiliary stack is not empty
            a) Pop a node from auxiliary stack and push it to result stack
            b) Push left and right children of the popped node to auxiliary stack
        3. Print contents of result stack
    b) Method 2 - Using One Stack
        1. Create an empty stack
        2. Do following while root is not NULL
            a) Push root's right child and then root to stack.
            b) Set root as root's left child.
        3. Pop an item from stack and set it as root.
            a) If the popped item has a right child and the right child
                is at top of stack, then remove the right child from stack,
                push the root back and set root as root's right child.
            b) Else print root's data and set root as NULL.
        4. Repeat steps 2 and 3 while stack is not empty.
    Note:
        One stack solution is no better than 2 stacks solution in terms of space complexity.
        If you look at 2 stack solution, every time you pop from one stack you push onto another
        stack, so essentially you are not maintaining more than one copy of the same element
        across the stacks. It is just a different way to think the solution.
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
     static void postOrder1(TreeNode root) {
        if(root==null) return;
        Stack <TreeNode> aux = new Stack<>();
        Stack <TreeNode> res = new Stack<>();
        aux.push(root);
        while(!aux.isEmpty()){
            root=aux.pop();
            res.push(root);

           if(root.left!=null){
            aux.push(root.left);
           }
           if(root.right!=null){
            aux.push(root.right);
           }
        }
        while(!res.isEmpty()){
            System.out.print(res.pop()+" ");
        }

    }

    static void postOrder2(TreeNode root) {
        if(root==null) return;
        Stack <TreeNode> st = new Stack<>();
        
       
        while(!st.isEmpty()||root!=null){
           while(root!=null){
            st.push(root);
            root=root.left;
           }
           
           root = st.peek().right;
           if(root==null){
            TreeNode last=null;
               while(!st.isEmpty()&&st.peek().right==last){
                   last= st.pop();
                  System.out.print(last.val+" ");
               }
           }
           
        }
        

    }
    public static void main(String[] args) {
         /* Constructed binary tree is:
              1
            /   \
          2      3
        /  \      \
      4     5       6
    */
     TreeNode root = new TreeNode(1);
    root.left        = new TreeNode(2);
    root.right       = new TreeNode(3);
    root.left.left  = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(6);

    postOrder1(root);
    System.out.println(" ");
    postOrder1(root);
    }
}