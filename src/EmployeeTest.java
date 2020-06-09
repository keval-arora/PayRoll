 import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee [] emp = new Employee[4];
		emp[0] = new SalariedEmployee("Keval",1217305,6000);
		emp[1] = new HourlyEmployee("Rohin", 1212121, 600, 16);
		emp[2] = new CommissionEmployee("Vikrant", 333333,56,0.7);
		emp[3] = new BasePlusCommission("Rishek", 435565, 54,0.9,5400);
		for(Employee currentemp : emp){
			System.out.println(currentemp.toString());
			System.out.println(currentemp.getName()+"'s Earnings is " + currentemp.earning()+'\n');
			{
				if(currentemp instanceof BasePlusCommission){
					BasePlusCommission empy = (BasePlusCommission)currentemp;
					empy.setBase_salary(1.10*empy.getBase_salary());
					System.out.println("New Base salary with 10% increase is:\n"+empy.getBase_salary());
				}
			}
		}

	}

}
