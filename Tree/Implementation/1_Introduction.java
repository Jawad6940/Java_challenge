class TreeeNode{
    int val;
    TreeeNode left,right;
    public TreeeNode(int val){
        this.val=val;
    }
}

class Main{
    public static void main(String[] args) {
        // Create Root Node
        TreeeNode node = new TreeeNode(1);
        // Attach left and right children
        node.left=new TreeeNode(2);
        node.right=new TreeeNode(3);



        
    /*        1
            /   \
          2       3
        /   \    /  \
       NULL NULL NULL NULL
    */
    }
}