package zmavenmvchibernate.gl.hib.service;

import java.util.List;

import org.springframework.stereotype.Service;

import zmavenmvchibernate.gl.hib.entity.Employee;



//@Service
public interface EmployeeService {

	public List <Employee> getEmployeesSvc();
	public Employee getEmployeeByIdSvc(int id);
	public void deleteEmployeeSvc(int id);
	public void saveEmployeeSvc(Employee employee);
	
}
