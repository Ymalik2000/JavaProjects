
public class MyBinaryTree {

	private StudentInfo rootNode;
	private int numInTree = 0;
	
	public void addToTree(StudentInfo targetNode, StudentInfo toAdd) {
		if (numInTree == 0) {
			rootNode = toAdd;
		}
		else {
			if (toAdd.getStudentNumber() < targetNode.getStudentNumber() ) {
				if (targetNode.getLeft() == null ) {
					targetNode.setLeft(toAdd);
				} 
				else {
					addToTree(targetNode.getLeft(), toAdd);
				}
			} else {
				if (targetNode.getRight() == null) {
					targetNode.setRight(toAdd); 
				} else {
					addToTree(targetNode.getRight(), toAdd);
				}
			}
		}
		numInTree++; 
	}

	
	//Traversal Methods
public void inorder(StudentInfo targetNode) {
	if (targetNode != null) {
		inorder(targetNode.getLeft());
		System.out.print(targetNode.getStudentNumber() + ", ");
		inorder(targetNode.getRight());
	}

}

public void preorder(StudentInfo targetNode) {
	if (targetNode != null) {
		System.out.print(targetNode.getStudentNumber() + ", ");
		preorder(targetNode.getLeft());
		preorder(targetNode.getRight());
	}
}

public void postorder(StudentInfo targetNode) {
	if (targetNode != null) {
		postorder(targetNode.getLeft());
		postorder(targetNode.getRight());
		System.out.print(targetNode.getStudentNumber() + ", ");
	}
}

//Getter and Setter Methods
	public StudentInfo getRoot() {
		return rootNode;
	}

	public void setRoot(StudentInfo rootNode) {
		this.rootNode = rootNode;
	}

	public int getNumInTree() {
		return numInTree;
	}

	public void setNumInTree(int numInTree) {
		this.numInTree = numInTree;
	}
}
