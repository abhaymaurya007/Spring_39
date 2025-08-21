package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.BankAccount;
import com.nt.repository.IBankAccountRepository;

@Service
public class BankMgmtServiceImpl implements IBankMgmtService {
	@Autowired
	private IBankAccountRepository  bankRepo;
	

	@Override
	public String withdraw(long acno, double amount) {
		//Load the BankAccount
		Optional<BankAccount> opt=bankRepo.findById(acno);
		if(opt.isPresent()) {
			BankAccount account=opt.get();
			account.setBalance(account.getBalance()-amount);
			//update the object
			bankRepo.save(account);
			return  amount+"  amount is withdrawn from account  number"+acno;
		}
		return acno+"  account is not found for withdraw operation";
	}

	@Override
	public String deposite(long acno, double amount) {
		//Load the BankAccount
		Optional<BankAccount> opt=bankRepo.findById(acno);
		if(opt.isPresent()) {
			BankAccount account=opt.get();
			account.setBalance(account.getBalance()+amount);
			//update the object
			bankRepo.save(account);
			return  amount+"  amount is deposited into account  number"+acno;
		}
		return acno+"  account is not found for deposite operation";
	}
	
	@Override
	public String openBankAccount(BankAccount account) {
		  //save the object
		long accno=bankRepo.save(account).getAccno();
		return   "Bank Account is opened having account number:"+accno;
	}
	
	@Override
	public BankAccount showAccountDetailsByAccno(long accno) {
		return bankRepo.findById(accno).orElseThrow(()-> new IllegalArgumentException("Invalid Id"));
	}

}
