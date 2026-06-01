public class BinaryTree {
    private BTNode root;

    public BinaryTree(BTNode root) {
        this.root = root;
    }

    public void printBT() {
        printBT(root,0);//runs the private
    }

    private void printBT(BTNode node, int depth){
        if(node == null){//if its empty print out empty dash
            System.out.println("-");
            return;
        }
        System.out.println("-" + node.data);//print curr node
        printBT(node.left, depth+1);//goes to the left node
        printBT(node.right, depth+1);//goes to the right node
    }

    public void printInOrder() {
        printInOrder(root);//runs the private
    }

    private void printInOrder(BTNode node){
        if(node==null){
            return;
        }
        printInOrder(node.left);//left node
        System.out.println(node.data);//prints the nodes
        printInOrder(node.right);//right node
    }

    public void printReverseInOrder() {
        printReverseInOrder(root);//runs the private
    }

    private void printReverseInOrder(BTNode node){
        if(node==null){
            return;
        }
        printInOrder(node.right);//right node
        System.out.println(node.data);//prints the node
        printInOrder(node.left);//left node
    }

    public int countNodesWithTwoChildren() {
        int amount = countNodesWithTwoChildren(root);//runs the private and makes the int and returns it
        return amount;
    }

    private int countNodesWithTwoChildren(BTNode node){
        if(node==null){
            return 0; //adds nothing or no children
        }

        int count = 0;
        if(node.left != null && node.right != null){
            count = 1;  // This node has both children count it
        }
        count += countNodesWithTwoChildren(node.left);  // go left and adds next to the total
        count += countNodesWithTwoChildren(node.right); // go right and adds next to the total
    
        return count;  // total
    }

    public int getHeight() {
        int height = getHeight(root);
        return height+1;
    }

    private int getHeight(BTNode node){
        if(node == null){
            return -1; // empty tree return -1 to show empty
        }
    
        int leftHeight = getHeight(node.left);//gets the left node height
        int rightHeight = getHeight(node.right);//gets the right node height
    
        int maxHeight;
        if(leftHeight > rightHeight){//compares the length of the left node to the right node and sees which one is deeper
            maxHeight = leftHeight;
        } else {
            maxHeight = rightHeight;
        }
    
        return 1 + maxHeight;//returns the deepest node including the one that it is on  meaning the top one as well
    }

    public int size() {
        int size = size(root);
        return size;
    }

    private int size(BTNode node){
        if(node==null){
            return 0;//node is empty
        }
        int leftAmount = size(node.left);//amount of nodes on the left
        int rightHeight = size(node.right);//amount of nodes on the right
        int total = leftAmount+rightHeight+1;//adds them together and curr node
        return total;
    }

    public void insert(String str) {
        BTNode newNode = new BTNode(str);
        if (root == null) {//if empty
            root = newNode;
        } else {
            insert(root, newNode);//then try to insert
        }
    }

    private boolean insert(BTNode current, BTNode newNode) {
        
        if (current.left == null) {// check if left is null
            current.left = newNode;
            return true;
        }
        
        if (current.right == null) {// check if right is null
            current.right = newNode;
            return true;
        }
        
        if (insert(current.left, newNode)) {//try to insert in the left children first
            return true;
        }
        
        return insert(current.right, newNode);// if left children is full, insert into the right children
    }
}