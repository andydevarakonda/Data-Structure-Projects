public class BST  {

    private BSTNode root;

    public BST() {
        root = null;
    }

    public void add(int item) {
        recAdd(root,item);
    }

    public void recAdd(BSTNode node, int item) {
        if(root == null) {
            root = new BSTNode(item);
        }else if(item < node.getItem()) {
            if(node.getLeft() == null) {
                node.setLeft(new BSTNode(item));
            }else {
                recAdd(node.getLeft(),item);
            }
        }else if(item > node.getItem()) {
            if(node.getRight() == null) {
                node.setRight(new BSTNode(item));
            }else {
                recAdd(node.getRight(),item);
            }
        }else {
            System.out.println("Warning: Can Not Add Duplicate Value ("+item+")");
        }
    }

    @Override
    public String toString() {
        return recToString(root);    
    }

    public String recToString(BSTNode node) {
        if(node == null) 
            return "";

        return "("+recToString(node.getLeft())+node.getItem()+recToString(node.getRight())+")";        
    }

    public boolean isBalanced() {
        return recIsBalanced(root);
    }

    //Recursive method which determines if the subtree with the given root is balanced
    //Remember that a tree is balanced if and only if:
    //    a) the difference between the heights of the right and left subtrees is zero, one or minus 1,
    //    b) AND each of the right and left subtrees are also balanced.
    //Call the height() method from this method.
    public boolean recIsBalanced(BSTNode node) {

        if(node == null){
            return true;
        }
        int lHeight = height(node.getLeft());
        int rHeight = height(node.getRight());

        if(recIsBalanced(node.getRight()) && Math.abs(rHeight - lHeight) <= 1 && recIsBalanced(node.getLeft()) ) {
            return true;
        }

        return false; 
    }

    //Calculate the height of a given node (use recursion)
    public int height(BSTNode node) {

        int height = -1;
        
        if(root == null) 
        	return height;
        else if(node != null) 
        {
        	int lHeight = height(node.getLeft()); 
        	int rHeight = height(node.getRight()); 
        	height = 1 + Math.max(rHeight, lHeight);
        }

        return height; 
    }
    }
