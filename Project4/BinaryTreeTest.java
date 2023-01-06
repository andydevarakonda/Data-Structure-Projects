public class BinaryTreeTest {
    public static void main(String[] args) {

        System.out.println("-----Test Tree 1-----");
        printOutput(testTree1());
        System.out.println("-----Test Tree 2-----");
        printOutput(testTree2());
        System.out.println("-----Test Tree 3-----");
        printOutput(testTree3());
    }


    public static void printOutput(BinaryTree root){
        System.out.print("Inorder traversal: ");
        root.inorderTraversal();
        System.out.println();
        System.out.println("Size of the tree: " +root.size());
        System.out.println("Height of the tree: " +root.height());
        System.out.println();
    }

    public static BinaryTree testTree1(){
        //First, sub-trees ll and lr are created
        BinaryTree ll = new BinaryTree(5);                
        ll.attachToLeft(3);
        ll.attachToRight(7);

        BinaryTree lr = new BinaryTree(15);
        lr.attachToLeft(13);
        lr.attachToRight(17);

        //Now sub-trees are attached to a tree l
        BinaryTree l = new BinaryTree(10, ll, lr);

        //A new subtree, r, is created
        BinaryTree r = new BinaryTree(30);
        r.attachToLeft(25);
        r.attachToRight(35);

        //A new subtree, t, is created, Also l and r are added to the tree as the sub-trees
        BinaryTree t = new BinaryTree(20, l, r);
        return t;
    }

    public static BinaryTree testTree2(){
        BinaryTree s = new BinaryTree(41);
        s.attachToLeft(31);
        s.attachToRight(60);

        BinaryTree t = new BinaryTree(24);
        t.attachToLeftSubtree(s);
        return t;
    }

    public static BinaryTree testTree3(){
        BinaryTree r = new BinaryTree(15);
        r.attachToLeft(9);
        r.attachToRight(17);

        BinaryTree l = new BinaryTree(5);
        l.attachToLeft(1);
        l.attachToRight(7);

        BinaryTree t = new BinaryTree(10, l, r);
        return t;
    }
}