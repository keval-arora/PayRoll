
public class CommissionEmployee extends Employee {
	private double gross_sale;
	private double commission_rate;
	//
	public CommissionEmployee(String name, int empno, double sale, double rate)
	{
		super(name, empno);
		if(sale<0)throw new IllegalArgumentException("Gross_Sale must be greater than Zero"); 
		{
			this.setGross_sale(sale);
		}
		if(rate<0 || rate > 1)throw new IllegalArgumentException("Commission Rate must be fractional");
		{
		this.setCommission_rate(rate);
		}
	}
	public double getGross_sale() {
		return gross_sale;
	}
	public void setGross_sale(double gross_sale) {
		if(gross_sale<0)throw new IllegalArgumentException("Gross_Sale must be greater than Zero"); 
		this.gross_sale = gross_sale;
	}
	public double getCommission_rate() {
		return commission_rate;
	}
	public void setCommission_rate(double commission_rate) {
		if(commission_rate<0 || commission_rate > 1)throw new IllegalArgumentException("Commission Rate must be fractional");
		this.commission_rate = commission_rate;
	}
	//
	@Override
	public double earning(){
		return getGross_sale() * getCommission_rate();
	}
	@Override
	public String toString(){
		return String.format(super.toString() +"\n" +  "Gross Sale is " + getGross_sale() + "\n" + "Commission Rate is " + getCommission_rate() );
	}

}
