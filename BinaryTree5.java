class Node {
    int data;
    Node left, right;
	public Node(int item) {
        data = item;
        left = right = null;
    }
}
public class BinaryTree5 {
    Node root;
    int countNonLeafNodes(Node node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 0;
        return 1 + countNonLeafNodes(node.left) + countNonLeafNodes(node.right);
    }
	public static void main(String[] args) {
        BinaryTree5 tree = new BinaryTree5();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
		int count = tree.countNonLeafNodes(tree.root);
        System.out.println("Number of non-leaf nodes: " + count);
    }
}
