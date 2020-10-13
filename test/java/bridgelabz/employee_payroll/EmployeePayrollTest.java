package bridgelabz.employee_payroll;

import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import bridgelabz.employee_payroll.EmployeePayrollMain.IOCommand;

public class EmployeePayrollTest {

	EmployeePayrollMain employeeFunction;
	
	@Before
	public void init() {
		EmployeePayrollData[] arrayOfEmp = {
				new EmployeePayrollData(1,"Jeff Bezos",100000.0),
				new EmployeePayrollData(2, "Bill Gates",200000.0),
				new EmployeePayrollData(3, "Mark Zuckerberg",300000.0)
		};
		
		employeeFunction = new EmployeePayrollMain();
		employeeFunction.setEmployeeDataList(Arrays.asList(arrayOfEmp));
		employeeFunction.writeEmployeeData(IOCommand.FILE_IO);
	}
	
	@Test
	public void givenThreeEmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
		assertEquals(3, employeeFunction.countEntries(IOCommand.FILE_IO));
	}
}