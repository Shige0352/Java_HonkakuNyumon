package chapter13;

public int updateEmployee(int employeeId, String employeeName) throws SQLException {
	Emplyee Emp = new Employee();
	Emp.setEmployeeId(employeeId);
	Emp.setEmployeeName(employeeName);
	return this.employeeDao.update(emp);

}