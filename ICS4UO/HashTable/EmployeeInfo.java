public class EmployeeInfo {

	protected int empNum;
    protected String firstName;
    protected String lastName;
    protected int sex; // encode e.g. 0 for M, 1 for F, etc.
    protected String workLoc; // encode e.g. 0 for Mississauga, etc.
    protected double deductionRate; // e.g. 0.21 for 21%

    public EmployeeInfo(int employeeNumber, String Fn, String Ln, int sex, String workLoc, double deductRate){
		this.empNum = employeeNumber;
		this.firstName = Fn;
		this.lastName = Ln;
		this.sex = sex;
		this.workLoc = workLoc;
		this.deductionRate = deductRate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmpNumber() {
		return empNum;
	}
	public void setEmpNumber(int empNumber) {
		this.empNum = empNumber;
	}
	public double getDeductRate() {
		return deductionRate;
	}
	public void setDeductRate(double deductRate) {
		this.deductionRate = deductRate;
	}
}