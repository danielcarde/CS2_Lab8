public class Lab8_Runner {
    public static void main(String[] args) {
        BTNode mango = new BTNode("Mango");
        BTNode jackfruit = new BTNode("Jackfruit");
        BTNode rambutan = new BTNode("Rambutan");
        BTNode peach = new BTNode("Peach");
        BTNode grapes = new BTNode("Grapes");
        BTNode kiwi = new BTNode("Kiwi");
        BTNode vanilla = new BTNode("Vanilla");
        BTNode quince = new BTNode("Quince");

        mango.left = jackfruit;
        mango.right = rambutan;

        jackfruit.left = grapes;
        jackfruit.right = kiwi;

        rambutan.left = peach;
        rambutan.right = vanilla;

        peach.right = quince;

        BinaryTree tree = new BinaryTree(mango);

        System.out.println("---------------------------");
        System.out.println("Printing binary tree:"); 
        tree.printBT();
        
        System.out.println("---------------------------");
        System.out.println("\nIn-Order Traversal:");
        tree.printInOrder();
        
        System.out.println("---------------------------");
        System.out.println("\nReverse In-Order Traversal:");
        tree.printReverseInOrder();
        
        System.out.println("---------------------------");
        System.out.println("\nNodes with Two Children: " + tree.countNodesWithTwoChildren());

        System.out.println("---------------------------");
        System.out.println("Height of Tree: " + tree.getHeight());

        System.out.println("---------------------------");
        System.out.println("Total Number of Nodes: " + tree.size());
        System.out.println("---------------------------");
    }
}