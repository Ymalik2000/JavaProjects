public class HashTest {
	
	static MyHashTable theHashTable = new MyHashTable(3);

	public static void main(String[] args) {
		
		EmployeeInfo emp1 = new EmployeeInfo(2);
		theHashTable.addEmployee(emp1);
		theHashTable.displayContents();
		theHashTable.searchByEmployeeNumber(2);
		theHashTable.removeEmployee(emp1);
		theHashTable.displayContents();
		theHashTable.searchByEmployeeNumber(2);
	}

}
