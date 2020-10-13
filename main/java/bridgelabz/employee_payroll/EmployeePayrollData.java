package bridgelabz.employee_payroll;

public class EmployeePayrollData {
	public int id;
	public String name;
	public double salary;

	public EmployeePayrollData(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void printData() {
		System.out.println("------------------------------------------------------");
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
		System.out.println("------------------------------------------------------");
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Created new Employee Data";
	}
}