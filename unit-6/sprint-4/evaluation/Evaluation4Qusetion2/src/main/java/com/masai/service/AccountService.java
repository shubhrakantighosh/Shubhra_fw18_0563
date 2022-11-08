package com.masai.service;

import com.masai.exceptions.AccountException;
import com.masai.exceptions.InsufficientFundException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;

public interface AccountService {
	
	public Account openAccount(Account acc)throws AccountException;
	public Account closeAccount(Integer accno)throws AccountException;
	public Account depositAmount(Integer accno, Integer amount)throws AccountException;
	public Account withdrawAmount(int accno, Integer amount)throws AccountException, InsufficientFundException;
	public String transferAmount(AccountDTO dto)throws AccountException,InsufficientFundException;
	

}
