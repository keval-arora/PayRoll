
public class BasePlusCommission extends CommissionEmployee{
	private double base_salary;
	//
	public BasePlusCommission(String name, int empno, double sale, double rate, double salary){
		super(name , empno, sale , rate);
		if(salary<0)throw new IllegalArgumentException("Salary must be greater than zero"); 
		this.setBase_salary(salary);
	}
	//
	public double getBase_salary() {
		return base_salary;
	}
	public void setBase_salary(double base_salary) {
		if(base_salary<0)throw new IllegalArgumentException("Salary must be greater than zero");
		this.base_salary = base_salary;
	}
	@Override
	public double earning(){
		   return getBase_salary()+ super.earning();
	   }
	@Override
	public String toString(){
		return String.format(super.toString()+ "\n" + "Base Salary is " + getBase_salary());
	}

}
