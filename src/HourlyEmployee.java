
public class HourlyEmployee extends Employee {

	private double wage;
	private int hour;
	//
	public HourlyEmployee(String name, int empno, double rate, int hour) {
		super(name, empno);
		if(rate<0)throw new IllegalArgumentException("Rate must be Positive");
		this.wage = rate;
		if(hour>168)throw new IllegalArgumentException("Hours must be less than 168");
		this.hour = hour;
	}
	//
	public double getWage() {
		return wage;
	}
	public void setWage(double rate) {
		if(rate<0 || rate>1)throw new IllegalArgumentException("Rate must be fractional");
		this.wage = rate;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour>168)throw new IllegalArgumentException("Hours must be less than 168");
		this.hour = hour;
	}
	//
	@Override
	public double earning() {
		
		if(getHour()<40)
			return getWage()*getHour();
		else
			return 40*getWage() + (getWage()*(getHour()-40)*1.5);
		
	}
	@Override
	public String toString(){
		return String.format(super.toString() + "\n" + "Wage is " + getWage() + "\nHours Worked is " + getHour());
	}

}
