package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Customer;

public interface ICustomerRepository extends  JpaRepository<Customer, Integer> {
	//@Query("select  cust.cno,cust.cname,cust.caddrs,ph.regno,ph.mobileno,ph.type,ph.provider  from Customer cust  inner join  cust.phones ph")
	//@Query("select  cust.cno,cust.cname,cust.caddrs,ph.regno,ph.mobileno,ph.type,ph.provider  from Customer cust  left join  cust.phones ph")
	//@Query("select  cust.cno,cust.cname,cust.caddrs,ph.regno,ph.mobileno,ph.type,ph.provider  from Customer cust  right join  cust.phones ph")
	@Query("select  cust.cno,cust.cname,cust.caddrs,ph.regno,ph.mobileno,ph.type,ph.provider  from Customer cust  full join  cust.phones ph")
	
	public   List<Object[]>   fetchCustomerAndPhoneNumbersDataUsingJoins();

}
