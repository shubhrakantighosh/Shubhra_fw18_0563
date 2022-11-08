package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.AccountController;
import com.masai.exceptions.AccountException;
import com.masai.exceptions.InsufficientFundException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;

public class AccountServiceDaoImpl implements AccountService{

	@Autowired
	private AccountController accountController;
	
	@Override
	public Account openAccount(Account acc) throws AccountException {
		
		return accountController.openAccount(acc);
		
	}

	@Override
	public Account closeAccount(Integer accno) throws AccountException {
		
		return accountController.closeAccount(accno);
		
	}

	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {

		return accountController.depositAmount(amount, amount);
		
	}

	@Override
	public Account withdrawAmount(int accno, Integer amount) throws AccountException, InsufficientFundException {

		return accountController.withdrawAmount(amount, amount);
		
	}

	@Override
	public String transferAmount(AccountDTO dto) throws AccountException, InsufficientFundException {
		// TODO Auto-generated method stub
		return null;
	}

}
