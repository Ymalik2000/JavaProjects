//Yash Malik - 530704
//Mr. Dutton ICS4UO/E
public class MyBinaryTree {

	//Instantiates the numInTree variable, and the rootNode
	private StudentInfo rootNode;
	private int numInTree = 0;
	
	//Sets rootNode to the first value 
	public void addToTree(StudentInfo targetNode, StudentInfo toAdd) {
		if (numInTree == 0) {
			rootNode = toAdd;
		}
		else {
			//Checks whether the value to add is greater or less than the current node
			if (toAdd.getStudentNumber() < targetNode.getStudentNumber() ) {
				if (targetNode.getLeft() == null ) {
					targetNode.setLeft(toAdd);
				} 
				else {
					//If not, it sets the current node as rootNode
					addToTree(targetNode.getLeft(), toAdd);
				}
			} else {
				//If the input is valid, it sets the right value as the new value
				if (targetNode.getRight() == null) {
					targetNode.setRight(toAdd); 
				} else {
					addToTree(targetNode.getRight(), toAdd);
				}
			}
		}
		//Increases the numInTree counter
		numInTree++; 
	}

	
	//Traversal Methods
//InOrder Traversal
public void inorder(StudentInfo targetNode) {
	if (targetNode != null) {
		inorder(targetNode.getLeft());
		System.out.print(targetNode.getStudentNumber() + ", ");
		inorder(targetNode.getRight());
	}

}
//PreOrder Traversal
public void preorder(StudentInfo targetNode) {
	if (targetNode != null) {
		System.out.print(targetNode.getStudentNumber() + ", ");
		preorder(targetNode.getLeft());
		preorder(targetNode.getRight());
	}
}
//PostOrder Traversal
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
}
