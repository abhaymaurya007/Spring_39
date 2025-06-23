package com.nt.service;

import com.nt.entity.BankAccount;

public interface IBankMgmtService {
    public  String withdraw(long acno, double amout);
    public   String deposite(long acno,double  amount);
    public   String   openBankAccount(BankAccount account);
    public   BankAccount  showAccountDetailsByAccno(long accno);
    
}
