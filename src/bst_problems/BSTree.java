package bst_problems;


public class BSTree<T extends Comparable<T>> {

	private static class Tree<T> {
		T data;
		Tree<T> right, left;

		public Tree(T data) {
			this.data = data;
			right = left = null;
		}

	}

	private Tree<T> root;

	public void add(T newData) {
		root = add(root, newData);
	}

	private Tree<T> add(Tree<T> root, T newData) {

		if (root == null) {
			root = new Tree<T>(newData);
			return root;
		}
		int cmp = root.data.compareTo(newData);
		if (cmp < 0)
			root.right = add(root.right, newData);
		else
			root.left = add(root.left, newData);

		return root;
	}

	private T minValue(Tree<T> root) {
		if (root.left == null)
			return root.data;
		return minValue(root.left);
	}

	public void delete(T newData) {
		root = delete(root, newData);
	}

	private Tree<T> delete(Tree<T> root, T data) {

		if (root == null)
			return root;
		int cmp = root.data.compareTo(data);
		if (cmp > 0) {
			root.left = delete(root.left, data);
		} else if (cmp < 0)
			root.right = delete(root.right, data);
		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			root.data = minValue(root.right);
			root.right = delete(root.right, data);
		}

		return root;
	}

	public void inorder() {
		System.out.println("In Order BST Traversal: ");
		inorder(root);
	}

	private void inorder(Tree<T> root) {

		if (root == null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}

	public void preorder() {
		System.out.println("Pre Order BST Traversal");
		preorder(root);
	}

	private void preorder(Tree<T> root) {
		if (root == null)
			return;
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}

}
