package exercises3_14;


public class EmployeeTest {
	

	public static void main( String[] args){
		
		double yearly1, yearly2, raise1, raise2;
		//employee info for 2 employees
		Employee employee1 = new Employee(
				"Scott", "Hammer", 3000);
		
		Employee employee2 = new Employee(
				"Dan", "Daman", 8000);
		//geting the yearly pay
		yearly1 = 12 * employee1.getMonthPay();
		
		yearly2 = 12 * employee2.getMonthPay();
		//getting amount if given a raise.
		raise1 = yearly1 * 1.1;
		
		raise2 = yearly2 * 1.1;
		//telling user what there yearly pay is and what would it be with a 10% raise
		System.out.printf("\n%s %s will get $%.2f a year", employee1.getFirstN(),employee1.getLastN(), yearly1);
		
		System.out.printf("\n%s %s will get $%.2f a year", employee2.getFirstN(),employee2.getLastN(), yearly2);
		
		System.out.printf("\n%s %s will get $%.2f a year if given the raise", employee1.getFirstN(),employee1.getLastN(), raise1);
		
		System.out.printf("\n%s %s will get $%.2f a year if given the raise", employee2.getFirstN(),employee2.getLastN(), raise2);
		
	}
}
