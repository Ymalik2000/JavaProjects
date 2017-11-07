public class EmployeeInfo {

	protected int empNum;
    protected String firstName;
    protected String lastName;
    protected int sex; // encoded 0 for M, 1 for F
    protected String workLoc;
    protected double deductionRate; // e.g. 0.21 for 21%
    protected double yearlySalary;

    public EmployeeInfo(int employeeNumber, String Fn, String Ln, int sex, String workLoc, double deductRate){
		this.empNum = employeeNumber;
		this.firstName = Fn;
		this.lastName = Ln;
		this.sex = sex;
		this.workLoc = workLoc;
		this.deductionRate = deductRate;
	}
	public int getEmpNumber() {
		return empNum;
	}
	public void setEmpNumber(int empNumber) {
		this.empNum = empNumber;
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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getWorkLoc() {
		return workLoc;
	}
	public void setWorkLoc(String workLoc) {
		this.workLoc = workLoc;
	}
	public double getDeductionRate() {
		return deductionRate;
	}
	public void setDeductionRate(double deductionRate) {
		this.deductionRate = deductionRate;
	}
	public double getYearlySalary() {
		return yearlySalary;
	}
	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
}