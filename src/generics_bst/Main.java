package generics_bst;

public class Main {

	public static void main(String args[]) {
		
		BSTree<Integer> myTree = new BSTree<>();
		myTree.add(25);
		myTree.add(20);
		myTree.add(30);
		myTree.add(19);
		myTree.add(23);
		myTree.add(36);
		myTree.add(11);
		myTree.add(35);
		myTree.add(40);
		myTree.add(9);
		System.out.println("InOrder Traversal: ");
		myTree.inorder();
		System.out.println();
		System.out.println("PreOrder Traversal: ");
		myTree.preorder();
		System.out.println();
		System.out.println("PostOrder Traversal: ");
		myTree.postorder();
		System.out.println();
		System.out.println("Height of a Tree: " + myTree.height());
		System.out.println();
		System.out.println("LevelOrder Traversal: ");
		myTree.levelorder();
		//System.out.println();
		System.out.println("Search for 90: " + myTree.search(90));
		System.out.println(myTree.minimum());
		System.out.println(myTree.maximum());
		myTree.successor(35);
		myTree.deletenode(30);
		System.out.println();
		System.out.println("InOrder Traversal: ");
		myTree.inorder();
	}
}
