public class HashTest {
	
	MyHashTable theHashTable = new MyHashTable(3);

	public static void main(String[] args) {
		
		EmployeeInfo emp1 = new EmployeeInfo(420, "George");
		theHashTable.addEmployee(emp1);
	}

}
