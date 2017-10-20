public class StudentInfo {
	
	//Attributes
	//Each node will have a left and right child
	private StudentInfo leftChild,rightChild;
	private int StudentNumber;
	String firstName,lastName;
	
	//Constructor for StudentInfo
	//Sets initial values to null
	public StudentInfo(int StudentNumber, String FirstName, String LastName){
		leftChild = null;
		rightChild = null;
		firstName = " ";
		lastName = " ";
		
		this.StudentNumber = StudentNumber;
	}
	
	//Getter and Setter Methods
	
	public StudentInfo getLeft() {
		return leftChild;
	}

	public void setLeft(StudentInfo left) {
		this.leftChild = left;
	}

	public StudentInfo getRight() {
		return rightChild;
	}

	public void setRight(StudentInfo rightChild) {
		this.rightChild = rightChild;
	}

	public int getStudentNumber() {
		return StudentNumber;
	}

	public void setStudentNumber(int StudentNumber) {
		this.StudentNumber = StudentNumber;
	}
	

}
