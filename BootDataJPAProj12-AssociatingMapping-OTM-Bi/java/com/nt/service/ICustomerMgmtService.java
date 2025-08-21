package com.nt.service;

import java.util.List;

import com.nt.entity.Customer;
import com.nt.entity.PhoneNumber;

public interface ICustomerMgmtService {
    public  String   registerCustomerWithPhoneNumbers(Customer customer);
    public  String    registerPhoneNumbersWithCustomer(List<PhoneNumber> list);
    public   List<Customer>    showCustomerAndHisPhoneNumbers();
    public  List<PhoneNumber>  showPhoneNumbersAndTheirCustomers();
    public  String   removeCustomerAndHisPhoneNumbers(int cno);
    public  String   removePhoneNumbersAndTheirCustomer(List<Integer> ids); 
    public   String   removeAllPhoneNumbersOfACustomer(int id);
    public   String   removeOnePhoneNumberOfACustomer(int regno);
    public  String   addNewPhoneNumberToACustomer(int cno,PhoneNumber ph);
    public  String    removePhoneNumbersAndTheirCustomer(int cid);
}
