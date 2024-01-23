package Prc_151_170;

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}

	public void insert(int key) {
		root = insertRec(root, key);
	}

	private Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.data) {
			root.left = insertRec(root.left, key);
		} else if (key > root.data) {
			root.right = insertRec(root.right, key);
		}

		return root;
	}

//prc_157
	public static void inOrder(Node root) {
		if (root == null) {
			return;
		}

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

//prc_158
	public static void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

//prc_159
	public static void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");

	}

//prc_160
	public int countLeaf() {
		return countLeave(root);
	}

	private int countLeave(Node node) {
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {

			return 1;
		}

		return countLeave(node.left) + countLeave(node.right);
	}

}

public class prc_156_160 {

	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();

		t.insert(50);
		t.insert(30);
		t.insert(20);
		t.insert(40);
		t.insert(70);
		t.insert(60);
		t.insert(80);
		System.out.println("Inorder traversal:");
		BinaryTree.inOrder(t.root);
		System.out.println();
		System.out.println("pree order traversal:");
		BinaryTree.preOrder(t.root);
		System.out.println();
		System.out.println("post order traversal:");
		BinaryTree.postOrder(t.root);
		System.out.println();
		System.out.println("the leaves are :" + t.countLeaf());

	}
}
