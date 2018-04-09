package bst_problems;

public class Main {

	public static void main(String args[]) {
		
		BSTree<Integer> myTree = new BSTree<>();
		
		myTree.add(25);
		myTree.add(15);
		myTree.add(35);
		myTree.add(10);
		myTree.add(20);
		myTree.add(30);
		myTree.add(40);
		myTree.add(5);
		myTree.add(14);
		myTree.add(18);
		myTree.add(21);
		
		myTree.inorder();
		myTree.preorder();
		myTree.delete(40);
		myTree.inorder();
	}
	
}
