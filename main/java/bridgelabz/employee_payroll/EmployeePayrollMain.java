package bridgelabz.employee_payroll;

import java.util.*;

public class EmployeePayrollMain {
	
	public enum IOCommand
		{CONSOLE_IO,FILE_IO,DB_IO,REST_IO}
	
	//Declaring global var list of employee data
	public List<EmployeePayrollData> employeeDataList;

	public void setEmployeeDataList(List<EmployeePayrollData> employeeDataList) {
		this.employeeDataList = employeeDataList;
	}

	/**Constructor For Main Class
	 * 
	 */
	public EmployeePayrollMain() {
		employeeDataList = new ArrayList<EmployeePayrollData>();
	}

	/**Read Emp Data from console <br>
	 * Adds data to Employee Data List
	 */
	public void readEmployeeData() {
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
	
	/**Write Emp Data to console and file
	 * @param ioType <br> CONSOLE_IO or FILE_IO
	 */
	public void writeEmployeeData(IOCommand ioType) {
		if(ioType.equals(ioType.CONSOLE_IO)) {
			System.out.println("Writing Employee Payroll Data to Console.");
			for (EmployeePayrollData employee:employeeDataList) {
				employee.printData();
			}
		}else if (ioType.equals(ioType.FILE_IO)){
			new EmployeePayrollIO().writeData(employeeDataList);
			System.out.println("Write in File");
		}
	}
	
	public int countEntries(IOCommand ioType) {
		if(ioType.equals(IOCommand.FILE_IO)) 
			return new EmployeePayrollIO().countEntries();
		return 0;
	}
	
	//Main Method
	public static void main(String[] args) {
		EmployeePayrollMain employeeFunction = new EmployeePayrollMain();
		employeeFunction.readEmployeeData();
		employeeFunction.writeEmployeeData(IOCommand.CONSOLE_IO);
		employeeFunction.writeEmployeeData(IOCommand.FILE_IO);
	}
}