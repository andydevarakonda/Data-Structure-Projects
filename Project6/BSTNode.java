public class BSTNode {

    private int item;
    private BSTNode leftChild;
    private BSTNode rightChild;

    public BSTNode(int newItem) {
        // Initializes tree node with item and no children.
        item = newItem;
        leftChild  = null;
        rightChild = null;
    }  
    
    public int getItem() {
        // Returns the item field.
        return item;
    }  

    public void setItem(int newItem) {
        // Sets the item field to the new value newItem.
        item  = newItem;
    }  

    public BSTNode getLeft() {
        // Returns the reference to the left child.
        return leftChild;
    }  

    public void setLeft(BSTNode left) {
        // Sets the left child reference to left.
        leftChild  = left;
    }  

    public BSTNode getRight() {
        // Returns the reference to the right child.
        return rightChild;
    }  

    public void setRight(BSTNode right) {
        // Sets the right child reference to right.
        rightChild  = right;
    }

}  // end TreeNode