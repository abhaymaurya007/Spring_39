package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import com.nt.BootIocProj08DIMiniProjectApp;
import com.nt.model.Employee;

@Repository("empMySQLDAO")
@Profile({"dev","test","staging","default"})
public class MySQLEmployeeDAOImpl implements IEmployeeDAO {

   private  static final String    GET_EMPS_BY_DESGS="SELECT ENO,ENAME,DESG,SALARY,DEPTNO FROM EMPLOYEE WHERE DESG IN(?,?,?) ORDER BY DESG"; 
   private  static final String    INSERT_EMP_QUERY="INSERT INTO EMPLOYEE(ENAME,DESG,SALARY,DEPTNO) VALUES(?,?,?,?)"; 
	
	@Autowired
	private  DataSource ds;
	
	public MySQLEmployeeDAOImpl() {
		System.out.println("MySQLEmployeeDAOImpl:: 0-param consructor");
	}

   
	@Override
	public List<Employee> getEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list=null;
		System.out.println("EmployeeMySQLDAOImpl.getEmployeesByDesgs()");
		System.out.println("DataSource obj class name ::"+ds.getClass());
		
		try(//get Pooled jdbc con object
				 Connection con=ds.getConnection();
				//create  JDBC STatement object
				PreparedStatement  ps=con.prepareStatement(GET_EMPS_BY_DESGS);
				){
			//set values to Query params
			     ps.setString(1,desg1);
			     ps.setString(2, desg2);
			     ps.setString(3, desg3);
			//execute the SQL Query
			     try(ResultSet rs=ps.executeQuery()){
			    	 
			    	 //copy the records of ResultSEt to List of Employee objs
			    	 list=new ArrayList();
			    	 while(rs.next()) {
			    		  //copy each record  Employee class obj
			    		 Employee emp=new Employee();
			    		 emp.setEmpno(rs.getInt(1));
			    		 emp.setEname(rs.getString(2));
			    		 emp.setDesg(rs.getString(3));
			    		 emp.setSalary(rs.getDouble(4));
			    		 emp.setDeptno(rs.getInt(5));
			    		 //add  Employee class obj List collection
			    		 list.add(emp);
			    	 }//while
			     }//try2
		}//try1
		catch(SQLException se) {
			//se.printStackTrace();
			throw  se;  //Exception rethrowing
		}
		catch(Exception e) {
			//e.printStackTrace();
			throw e;
		}
		return list;
	}//method


	@Override
	public int insertEmployee(Employee emp) throws Exception {
		System.out.println("MySQLEmployeeDAOImpl.insertEmployee()");
		int result=0;
		try(//get Pooled con object
			         Connection con=ds.getConnection();
				//create PreparedStatement object
				  PreparedStatement ps=con.prepareStatement(INSERT_EMP_QUERY);
				){
			   // set values to  Query params
			ps.setString(1,emp.getEname());
			ps.setString(2, emp.getDesg());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4, emp.getDeptno());
			//execute  the SQL Query
		    result=ps.executeUpdate();
			return result;
		}//try
		catch(SQLException se) {
			//se.printStackTrace();
			throw se;
		}
		catch(Exception  e) {
			//e.printStackTrace();
			throw e;
		}
		
	}//method

}//class
