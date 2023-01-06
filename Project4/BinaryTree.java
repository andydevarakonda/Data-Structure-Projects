public class BinaryTree  {

    protected TreeNode root;

    //Constructor 1 (Default)
    //Initializes an empty tree
    public BinaryTree() {
        /* DO NOT EDIT THIS METHOD */
        root = null;
    }

    //Constructor 2
    //Initializes the tree with a root
    public BinaryTree(int rootItem) {
        /* DO NOT EDIT THIS METHOD */
        root = new TreeNode(rootItem, null, null);
    }

    //Constructor 3
    //Initializes the tree with the root, left subtree and right subtree
    public BinaryTree(int rootItem, BinaryTree leftTree, BinaryTree rightTree) {
        /* DO NOT EDIT THIS METHOD */
        root = new TreeNode(rootItem, null, null);
        attachToLeftSubtree(leftTree);
        attachToRightSubtree(rightTree);
    }

    //Tree Traversal: In Order
    public void inorderTraversal(){
        /* DO NOT EDIT THIS METHOD */
        inorderRecursive(root);
    }

    //Tree Traversal: In Order (recursive)
    public void inorderRecursive(TreeNode current) {
        /* DO NOT EDIT THIS METHOD */
        if (current != null) {
            inorderRecursive(current.getLeft());
            System.out.print(" " + current.getItem());
            inorderRecursive(current.getRight());
        }
    }

    //Attaches an item to the left branch
    public void attachToLeft(int newItem) {
        TreeNode n = new TreeNode(newItem); 

        if(root.getLeft() != null) 
            System.out.println("It is Occupied");
        else
            root.setLeft(n);

    }

    //Attaches an item to the right branch
    public void attachToRight(int newItem) {

        TreeNode n = new TreeNode(newItem); 

        if(root.getRight() != null) 
            System.out.println("It is Occupied");
        else
            root.setRight(n);
    }

    //Attaches a sub-tree to the left branch
    public void attachToLeftSubtree(BinaryTree leftTree) {

        if(root.getLeft() != null) 
            System.out.println("It is Occupied");
        else
            root.setLeft(leftTree.root);

    }

    //Attaches a sub-tree to the right branch
    public void attachToRightSubtree(BinaryTree rightTree) {

        if(root.getRight() != null) 
            System.out.println("It is Occupied");
        else
            root.setLeft(rightTree.root);

    }

    //Returns the number of nodes in the tree.
    public int size(){

        return sizeRecursive(root); //temporary, change this later
    }
    //Recursive method to calculate the number of nodes.
    public int sizeRecursive(TreeNode node) {

        if(node == null) 
        {
            return 0;
        }
        else
        {
            return sizeRecursive(node.getLeft()) + sizeRecursive(node.getRight()) +1;
        }
    }

    //Returns the height of the tree
    public int height(){

        return heightSubtree(root);

    }

    public int heightSubtree(TreeNode current){

        int height = -1;

        if(root == null) 
            return height;
        else if(current != null) 
        {
            int rightHeight = heightSubtree(current.getRight()); 
            int leftHeight = heightSubtree(current.getLeft()); 
            height = Math.max(rightHeight, leftHeight)+1; 
        }

        return height; 
    }
}