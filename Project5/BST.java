public class BST{
    private TreeNode root; // The root of the tree.

    //======================================
    //  Creates an empty binary search tree.
    //======================================
    public BST()
    {
        root = null;
    }

    //================================================================
    //  Add the specified item to the binary search tree in the
    //  appropriate position according to its key value.
    //================================================================
    public void insert(int newItem)
    {

        TreeNode n = new TreeNode(newItem);
        TreeNode p = null; 
        TreeNode cur = root; 

        if(root == null) 
        {
            root = n;
            return;
        }

        while(cur != null) 
        {
            p = cur; 

            if(newItem < cur.data) 
            {
                cur = cur.left;

                if(cur == null) 
                    p.left = n; 
                else
                {
                    cur = cur.right; 
                    if(cur == null)
                        p.right = n;
                }
            }

        }
    }

    //================================================================
    //  Traverse the tree in-order and show value in the binary
    //  search tree.
    //================================================================
    public void printTree()
    {
        if(root == null)
            System.out.println( "Empty tree." );
        else
        {
            inorderPrint(root);
        }
    }

    //A recursive function to show data in-order
    public void inorderPrint(TreeNode current) {
        if (current != null) {
            inorderPrint(current.left);
            System.out.print(current.data + " ");
            inorderPrint(current.right);
        }
    }

    //================================================================
    //  Traverse the tree and show the data in in in-order and show value
    //  in descending order.
    //================================================================
    public void printTreeDesc()
    {
        if(root == null)
            System.out.println( "Empty tree." );
        else
        {
            recPrintTreeDesc(root);
        }
    }

    //============================================
    //  A recursive method to to show data in in descending order
    //============================================
    public void recPrintTreeDesc(TreeNode current) {

        if(current != null)
        {
            recPrintTreeDesc(current.right); 
            System.out.println(current.data);
            recPrintTreeDesc(current.left);
        }

    }
    //============================================
    //  Traverse the tree and print the leaf nodes
    //============================================
    public void printLeafs(){
        recursivePrintLeafs(root);
    }

    //============================================
    //  A recursive method to print the leaf
    //============================================
    public void recursivePrintLeafs(TreeNode node) {

        if(node == null) {
            return;
        }

        if(node.left == null && node.right == null){
            System.out.println(node.data); 
            recursivePrintLeafs(node.left);
            recursivePrintLeafs(node.right); 
        }
    }
    //============================================
    //  Traverse the tree and print the internal nodes
    //============================================
    public void printInternalNodes(){
        recursiveInternalNodes(root);
    }

    //=================================================
    //  A recursive method to print the internal nodes
    //=================================================
    public void recursiveInternalNodes(TreeNode node) {

        if(node == null)
        {
            return;
        }

        if(node.left != null && node.right != null)
        {
            System.out.println(node.data); 
        }

        recursivePrintLeafs(node.left);
        recursivePrintLeafs(node.right);

    }

    //===============================================
    //  Count the number of items under a given key
    //===============================================
    public int countNodes(int key){
        TreeNode node = search(key);
        if (node == null)
            return -1;
        else
            return recursiveCountNodes(node);
    }

    //=================================================
    //  A recursive method to count the number of nodes
    //=================================================
    public int recursiveCountNodes(TreeNode node) {
        if(node == null) {
            return 0;
        }

        return recursiveCountNodes(node.left) + recursiveCountNodes(node.right)+1;
    }

    //=================================================
    //  Find the minimum value stored in the subtree
    //  rooted at a given key value
    //=================================================
    public TreeNode findSmallest(int item){

        TreeNode s = search(item);
        if(s == null) {
            return null;
        }

        
        while(s.left != null) {
            s = s.left;
        }

        return s; 
    }

    //=================================================
    //  An iterative code to search an item in a tree
    //=================================================
    public TreeNode search(int key){

        TreeNode current = root;
        boolean found = false;
        while ((current != null) && (!found)){
            if (key == current.data)
                found = true;
            else if (key < current.data)
                current = current.left;
            else
                current = current.right;
        }

        if (found)
            return current;
        else
            return null;
    }
}