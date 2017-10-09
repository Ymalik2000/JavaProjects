
public class BinaryTreeTest {
	public static void main(String[] args) {
		
		MyBinaryTree newTree = new MyBinaryTree();
		StudentInfo someStudent;
		
		someStudent = new StudentInfo(11, "Elmer","Fudd");
		newTree.addToTree(newTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(16, "Daffy","Duck");
		newTree.addToTree(newTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(13, "Lola","Bunny");
		newTree.addToTree(newTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(5, "Buggs","Bunny");
		newTree.addToTree(newTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(2, "Foghorn","Leghorn");
		newTree.addToTree(newTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(14, "Tweety","Bird");
		newTree.addToTree(newTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(17, "Sylvester","Cat");
		newTree.addToTree(newTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(1, "Marvin","Martian");
		newTree.addToTree(newTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(12, "Miss","Prissy");
		newTree.addToTree(newTree.getRoot(), someStudent);
		
		System.out.println("In Order Traversal: ");
		newTree.inorder(newTree.getRoot());
		System.out.println(" ");
		System.out.println("Pre Order Traversal: ");
		newTree.preorder(newTree.getRoot());
		System.out.println(" ");
		System.out.println("Post Order Traversal: ");
		newTree.postorder(newTree.getRoot());
	}
}
