package bridgelabz.employee_payroll;

import java.util.*;

public class EmployeePayrollMain {
	
	public enum IOCommand
		{CONSOLE_IO,FILE_IO,DB_IO,REST_IO}
	
	//Declaring global var list of employee data
	private List<EmployeePayrollData> employeeDataList;
	
	/**Constructor For Main Class
	 * 
	 */
	public EmployeePayrollMain() {
		employeeDataList = new ArrayList<EmployeePayrollData>();
	}

	/**Read Emp Data from console <br>
	 * Adds data to Employee Data List
	 */
	private void readEmployeeData() {
		Scanner consoleScanner=new Scanner(System.in);
		System.out.print("Enter Employee ID : ");
		int id = consoleScanner.nextInt();
		System.out.print("Enter Employee name : ");
		String name = consoleScanner.next();
		System.out.print("Enter Employee salary : ");
		double salary = consoleScanner.nextDouble();
		EmployeePayrollData employee=new EmployeePayrollData(id,name,salary);
		System.out.println(employee);
		employeeDataList.add(employee);
		consoleScanner.close();
	}
	
	/**
	 * Write Emp Data to console
	 */
	private void writeEmployeeData() {
		System.out.println("Writing Employee Payroll Data to Console.");
		for (EmployeePayrollData employee:employeeDataList) {
			employee.printData();
		}
	}
	
	//Main Method
	public static void main(String[] args) {
		EmployeePayrollMain employeeFunction = new EmployeePayrollMain();
		employeeFunction.readEmployeeData();
		employeeFunction.writeEmployeeData();
	}
}