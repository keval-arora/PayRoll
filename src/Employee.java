 
public abstract class Employee 
{
	private String name;
	private int empno;
	//Constructors
	public Employee(String name, int empno){
		this.setName(name);
		this.setEmpno(empno);
	}
	//Getters&Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	//UDFs
	public abstract double earning();
	@Override
	public String toString(){
		return String.format("Name is " + getName() +"\n"+ "Emp_ID is " + getEmpno());
	}
	
	

}
