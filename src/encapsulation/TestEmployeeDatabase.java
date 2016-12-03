package encapsulation;

public class TestEmployeeDatabase {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setEmployeeID(103);
		employee1.setEmployeeName("James");
		employee1.setEmployeeSSN("123-45-6789");
		employee1.setEmployeeDOB("01-01-1990");
		
		System.out.println(employee1.getEmployeeID() + " " + employee1.getEmployeeName() + " " + employee1.getEmployeeSSN() + " " + employee1.getEmployeeDOB() );
		
		
		Employee employee2 = new Employee();
		employee2.setEmployeeID(104);
		employee2.setEmployeeName("Seth");
		employee2.setEmployeeSSN("987-65-4321");
		employee2.setEmployeeDOB("02-22-1991");
		
		System.out.println(employee2.getEmployeeID() + " " + employee2.getEmployeeName() + " " + employee2.getEmployeeSSN() + " " + employee2.getEmployeeDOB() );
		

	}

}
