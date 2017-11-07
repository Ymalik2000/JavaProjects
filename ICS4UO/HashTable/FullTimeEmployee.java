public class FullTimeEmployee extends EmployeeInfo {
	
	protected double yearlySalary;

	public FullTimeEmployee(int employeeNumber, String Fn, String Ln, int sex, String workLoc, double deductRate, int yearlySalary) {
		super(employeeNumber, Fn, Ln, sex, workLoc, deductRate);
		this.yearlySalary = yearlySalary;
	}
	public double getYearlySalary() {
		return yearlySalary;
	}
	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	public double calcAnnualGrossIncome(){
		return this.yearlySalary;
	}
	
	public double annualNetIncome(){
		return calcAnnualGrossIncome()*(1-deductionRate);
	}
}