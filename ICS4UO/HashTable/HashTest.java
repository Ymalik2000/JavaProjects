public class HashTest {
	

	public static void main(String[] args) {
		
		MyHashTable theHashTable = new MyHashTable(3);
		FullTimeEmployee fullEmp;
		PartTimeEmployee partEmp;
		
		fullEmp = new FullTimeEmployee(2, "Daffy", "Duck", 0, "Mississauga", 0.21, 50000);
		theHashTable.addEmployee(fullEmp);
		theHashTable.employeeStats(fullEmp);
		//theEmployee = new FullTimeEmployee(6, "Foghorn", "Leghorn", 0, "Toronto", 0.21, 55);
		//theHashTable.addEmployee(theEmployee);
		partEmp = new PartTimeEmployee(15, "Sylvester", "Cat", 0, "Uganda", 0.21, 12, 40, 40);
		theHashTable.addEmployee(partEmp);
		theHashTable.employeeStats(partEmp);
		
		
		//System.out.println(theEmployee.getYearlySalary());
		//Method Test Section
		/*System.out.println(theEmployee.calcAnnualGrossIncome());
		System.out.println(theEmployee.AnnualNetIncome());
		theHashTable.displayContents();
		theHashTable.searchByEmployeeNumber(2);
		theHashTable.removeEmployee(theEmployee);
		theHashTable.displayContents();*/
	}

}