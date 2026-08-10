package BinaryTree;

public class BST {
	private Node root;
	public BST() {
		root=null;
	}
	public void Insert(int d) {
		Node temp=new Node(d);
		if (root==null)
			root=temp;
		else {
			Node current=root;
			Node parent=null;
			while(true) {
				parent=current;
				if(d<current.data) {
					current=current.left;
					if(current==null) {
						parent.left=temp;
						break;
					}
				}
				else {
					current=current.right;
					if(current==null) {
						parent.right=temp;
						break;
					}
				}
			}
		}
	}
	public void insert(int value) {
		root = insertHelper(root, value);
	}
	private Node insertHelper(Node node, int value) {
	if (node == null) {
	return new Node(value);
	}
	if (value < node.data) {
	node.left = insertHelper(node.left, value);
	} else if (value > node.data) {
	node.right = insertHelper(node.right, value);
	}
	return node;
	}
	public void printInOrder() {
		inOrder(root);
	}
	private void inOrder(Node n) {
		if (n == null)
	        return;
		inOrder(n.left);
		System.out.println(n.data+"  ");
		inOrder(n.right);
	}
	public boolean search(int value) {
		return searchHelper(root, value);
		}
	private boolean searchHelper(Node node, int value) {
	if (node == null) {
	return false;
	}
	if (value == node.data) {
	return true;
	}
	return value < node.data
	? searchHelper(node.left, value) : searchHelper(node.right, value);
	}
	public void preOrder() {
	preOrderHelper(root);
	}
	private void preOrderHelper(Node node) {
		if (node == null) return;
		System.out.print(node.data + " ");
	preOrderHelper(node.left);
	preOrderHelper(node.right);
	}
	public void postOrder() {
		postOrderHelper(root);
	}
	private void postOrderHelper(Node node) {
	if (node == null) return;
	postOrderHelper(node.left);
	postOrderHelper(node.right);
	System.out.print(node.data + " ");
	}
	public boolean isLeaf(Node node) {
	    return node != null && node.left == null && node.right == null;
	}
	public boolean isParent(Node node) {
	    return node != null && (node.left != null || node.right != null);
	}
	public int maximum() {
	    if (root == null)
	        return -1;

	    Node current = root;

	    while (current.right != null) {
	        current = current.right;
	    }

	    return current.data;
	}
	public int minimum() {
	    if (root == null)
	        return -1;

	    Node current = root;

	    while (current.left != null) {
	        current = current.left;
	    }

	    return current.data;
	}
	public int Height() {
	    return heightHelper(root);
	}

	private int heightHelper(Node node) {
	    if (node == null)
	        return -1;

	    int leftHeight = heightHelper(node.left);
	    int rightHeight = heightHelper(node.right);

	    return 1 + Math.max(leftHeight, rightHeight);
	}
	public void printParents(Node node) {
	    if (node == null || node == root)
	        return;

	    Node current = root;

	    while (current != null) {
	        if (node.data < current.data) {
	            if (current.left == node) {
	                System.out.print(current.data + " ");
	                return;
	            }
	            current = current.left;
	        }
	        else if (node.data > current.data) {
	            if (current.right == node) {
	                System.out.print(current.data + " ");
	                return;
	            }
	            current = current.right;
	        }
	        else {
	            return;
	        }
	    }
	}
}