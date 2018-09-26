package chapter13;

import java.sql.SQLException;

import chapter10.Employee;

public class EmployeeService {

	private EmployeeDao emploteeDao;

	public int updateEmployee(int employeeId, String employeeName) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(employeeName);
		return this.employeeDao.update(employee);

	}
	(後略)
}