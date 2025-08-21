package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
		private   IEmployeeDAO  empDAO;

	public EmployeeMgmtServiceImpl() {
		System.out.println("EmployeeMgmtServiceImpl:: 0-param constructor");
	}
	
	@Override
	public List<Employee> showEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeMgmtServiceImpl.showEmployeesByDesgs()");
		// convert  desgs into  UPPERCASE Letters (b.logic)
		desg1=desg1.toUpperCase();
		desg2=desg2.toUpperCase();
		desg3=desg3.toUpperCase();
		//use   DAO
		List<Employee> list=empDAO.getEmployeesByDesgs(desg1, desg2, desg3);
		//  calculate  gross Salary and  net Salary  (b.logic)
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSalary()+ (emp.getSalary()*0.4));
			emp.setNetSalary(emp.getGrossSalary()- (emp.getGrossSalary()*0.2));
		});
		
		return list;
	}

	@Override
	public String registerEmployee(Employee emp)throws Exception {
		//use  DAO
		int count=empDAO.insertEmployee(emp);
		
		return  count==0? "Employee is not registered" :"Employee is registered";
	}

}
