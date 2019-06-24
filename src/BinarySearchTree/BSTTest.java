package BinarySearchTree;

//import java.util.ArrayList<BST.TreeNode<String>> path = tree.path("Peter");

public class BSTTest {
    public static void main(String[] args) {


        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Micheal");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        //Tree.Invoker();

        //Traverse tree
        System.out.println("InOrder (sorted): ");
        tree.inorder();
        System.out.println("\nPostorder: ");
        tree.postorder();
        System.out.println("\nPreorder: ");
        tree.preorder();


        java.util.ArrayList<BST.TreeNode<String>> path = tree.path("Peter");

        //Search for an element
        System.out.print("\nThe number of nodes is " + tree.getSize());

        System.out.println(("\nIs Peter in the tree? " + tree.search("Peter")));

        for ( int i = 0; i< path.size(); i++) {
            System.out.println(path.get(i).element);
//            System.out.println(path.get(path.size() - 1));

        }

        System.out.println("A path from the root to Peter is: " + path.size());

        int j = 0;
        //int i = 0;


    }







}
