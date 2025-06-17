class Node {
    int data;
    Node left, right;
	public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class BinaryTree6 {
    Node root;
    public BinaryTree6() {
        root = null;
    }
    public boolean search(Node node, int key) {
        if (node == null) {
            return false;
        }
        if (node.data == key) {
            return true;
        }
        return search(node.left, key) || search(node.right, key);
    }
	public static void main(String[] args) {
        BinaryTree6 tree = new BinaryTree6();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
		int valueToFind = 50;
        boolean found = tree.search(tree.root, valueToFind);
		if (found) {
            System.out.println(valueToFind + " is found in the tree.");
        } else {
            System.out.println(valueToFind + " is not found in the tree.");
        }
    }
}
