public class HashTest {
	
	static MyHashTable theHashTable = new MyHashTable(3);

	public static void main(String[] args) {
		
		FullTimeEmployee theEmployee = new FullTimeEmployee(2, "Daffy", "Duck", 0, "Mississauga", 0.21, 50000);
		theHashTable.addEmployee(theEmployee);
		theEmployee = new FullTimeEmployee(5, "Foghorn", "Leghorn", 0, "Toronto", 0.21, 55);
		theHashTable.addEmployee(theEmployee);
		
		
		
		//Input Test Section
		/*System.out.println(theEmployee.calcAnnualGrossIncome());
		theHashTable.addEmployee(theEmployee);
		theHashTable.displayContents();
		theHashTable.searchByEmployeeNumber(2);
		theHashTable.removeEmployee(theEmployee);
		theHashTable.displayContents();
		theHashTable.searchByEmployeeNumber(2);*/
	}

}