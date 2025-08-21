package com.nt.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.entity.PhoneNumber;
import com.nt.repository.ICustomerRepository;
import com.nt.repository.IPhoneNumberRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	@Autowired
	private ICustomerRepository  custRepo;
	@Autowired
	private IPhoneNumberRepository  phoneRepo;
	

	@Override
	public String registerCustomerWithPhoneNumbers(Customer customer) {
		//save the object
		int idVal=custRepo.save(customer).getCno();
		return "Customer and his PhoneNumbers are saved with the id Value :"+idVal;
	}
	@Override
	public String registerPhoneNumbersWithCustomer(List<PhoneNumber> list) {
		  //use repo  to save  objs
		 List<PhoneNumber>  savedList=phoneRepo.saveAll(list);
		 //gather only id values
		 List<Integer>  ids=savedList.stream().map(PhoneNumber::getRegno).collect(Collectors.toList());
		return  savedList.size()+" no.of phones are saved with id values::"+ids;
	}
	
	@Override
	public List<Customer> showCustomerAndHisPhoneNumbers() {
		return custRepo.findAll();
	}
	
	@Override
	public List<PhoneNumber> showPhoneNumbersAndTheirCustomers() {
		return phoneRepo.findAll();
	}
	
	@Override
	public String removeCustomerAndHisPhoneNumbers(int cno) {
	   //Load  Customer obj and his PhoneNumbers
		Customer cust=custRepo.findById(cno).orElseThrow(()-> new IllegalArgumentException("invalid id"));
		//delete  customer and his PhoneNumbers
		custRepo.delete(cust);
		return cno+" Customer and his phoneNumbes are deleted";
		
	}
	
	@Override
	public String removePhoneNumbersAndTheirCustomer(List<Integer> ids) {
		  //Load childs by ids
		List<PhoneNumber>  list=phoneRepo.findAllById(ids);
		if(list.size()!=0) {
			   phoneRepo.deleteAllById(ids);
			   return list.size()+" no.of PhoneNumbers and their associated Customer are deleted";
		}
		else
			return "PhoneNumbers are not found";
		
	}
	@Override
	public String removeAllPhoneNumbersOfACustomer(int id) {
		//Load  customer  obj
		Customer cust=custRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid id"));
		//get all the phoneNumbers of Customer
		Set<PhoneNumber> childs=cust.getPhones();
		childs.forEach(ph->{
			ph.setCust(null);
		});
		//delete all childs
		phoneRepo.deleteAllInBatch(childs);
		return  id+" Customer All phoneNumbers are deleted";
	}
	
	@Override
	@Transactional
	public String removeOnePhoneNumberOfACustomer(int regno) {
		//Load PhoneNumber obj (child)
		PhoneNumber ph=phoneRepo.findById(regno).orElseThrow(()->new IllegalArgumentException("invalid regno"));
		//remove link with parent  from child
		ph.setCust(null);
	
		//delete  PhoneNumber obj
		phoneRepo.save(ph);
		phoneRepo.delete(ph);
		return  ph.getMobileno()+"  of  customer  is deleted";
	}
	
	@Override
	@Transactional
	public String addNewPhoneNumberToACustomer(int cno, PhoneNumber ph) {
		//Load Customer object
		Customer  cust=custRepo.findById(cno).orElseThrow(()-> new IllegalArgumentException("invalid id"));
		//get all phonenumbers(childs) of  a customer
		Set<PhoneNumber> childs=cust.getPhones();
		//add new PhoneNumber
		childs.add(ph);
		//add Customer to PhoneNumber
		ph.setCust(cust);
		//update the PhoneNumber obj
		custRepo.save(cust);
		return ph.getMobileno() +" PhoneNumber is  added to customer "+cno;
	}
	
	@Override
	public String removePhoneNumbersAndTheirCustomer(int cid) {
		//Load Customer object
		Customer  cust=custRepo.findById(cid).orElseThrow(()-> new IllegalArgumentException("invalid id"));
		//get all phonenumbers(childs) of  a customer
		Set<PhoneNumber> childs=cust.getPhones();
		//delte all PhoneNumbers of  a customer
		childs.forEach(ph->{
			phoneRepo.delete(ph);
		});
	 	return childs.size()+"  no.of  PhoneNumbers and their associated Customer is deleted";
	}
	

}
