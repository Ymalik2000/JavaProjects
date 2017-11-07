public class HashTest {
	

	public static void main(String[] args) {
		
		MyHashTable theHashTable = new MyHashTable(3);
		FullTimeEmployee theEmployee;
		
		theEmployee= new FullTimeEmployee(2, "Daffy", "Duck", 0, "Mississauga", 0.21, 50000);
		theHashTable.addEmployee(theEmployee);
		//theEmployee = new FullTimeEmployee(6, "Foghorn", "Leghorn", 0, "Toronto", 0.21, 55);
		//theHashTable.addEmployee(theEmployee);
		
		
		System.out.println(theEmployee.getYearlySalary());
		//Method Test Section
		/*System.out.println(theEmployee.calcAnnualGrossIncome());
		System.out.println(theEmployee.AnnualNetIncome());
		theHashTable.displayContents();
		theHashTable.searchByEmployeeNumber(2);
		theHashTable.removeEmployee(theEmployee);
		theHashTable.displayContents();*/
	}

}
