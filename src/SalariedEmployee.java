
public class SalariedEmployee extends Employee {
	private double basicSalary;
	//Constructors
	public SalariedEmployee(String name, int empno, double basicSalary) {
		super(name, empno);
		if(basicSalary<0)throw new IllegalArgumentException("Basic Salary for the Salaried Employee must be greater than Zero");
		this.setBasicSalary(basicSalary);
	}
	//Getters&Setters
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		if(basicSalary<0)	throw new IllegalArgumentException("Basic Salary for the Salaried Employee must be greater than Zero");
		this.basicSalary = basicSalary;
	}
	//UDFs
	@Override
	public double earning(){
		return getBasicSalary();
	}
	@Override
	public String toString(){
		return String.format(super.toString() + "\n" + "Basic Salary is " + getBasicSalary());
	}

	
	

}
