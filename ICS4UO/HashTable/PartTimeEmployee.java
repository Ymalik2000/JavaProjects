public class PartTimeEmployee extends EmployeeInfo {

	private double hourlyWage;
	private double hoursPerWeek;
	private double weeksPerYear;
	
	public PartTimeEmployee(int employeeNumber, String Fn, String Ln, int sex, String workLoc, int deductRate) {
		super (employeeNumber, Fn, Ln, sex, workLoc, deductRate);
	}
	
	public double calcAnnualGrossIncome(){		
		return hourlyWage*hoursPerWeek*weeksPerYear;
	}
	
	public double AnnualNetIncome(){
		return calcAnnualGrossIncome()*(1-deductionRate);
	}
}