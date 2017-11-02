
public class FullTimeEmployee extends EmployeeInfo {
	
	private double yearlySalary;

	public FullTimeEmployee(int employeeNumber, String firstName) {
		super(employeeNumber, firstName);
	}

	
	public double calcAnnualGrossIncome(){
		return this.yearlySalary;
	}
	
	public double AnnualNetIncome(){
		return calcAnnualGrossIncome()*(1-deductionRate);
	}
}
