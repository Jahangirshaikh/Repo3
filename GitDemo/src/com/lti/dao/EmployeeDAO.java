package com.lti.dao;
import com.lti.entity.Employee;

public interface EmployeeDAO {
  public Employee addEmployee(Employee e);
  public void showEmployee();
  public void showSalary();
}
