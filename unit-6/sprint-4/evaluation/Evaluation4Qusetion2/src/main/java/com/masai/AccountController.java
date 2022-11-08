package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.AccountException;
import com.masai.exceptions.InsufficientFundException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;
import com.masai.repo.AccountRepo;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	private AccountRepo accountRepo;
	
	@PostMapping("/account")
	public Account openAccount(@RequestBody Account account) {
		return accountRepo.save(account);
	}
	
	@DeleteMapping("/remove/{accountNo}")
	public Account closeAccount(@PathVariable("accountNo") Integer accountNo) throws AccountException {
		
		Account account=accountRepo.findById(accountNo).get();
		
		if(account==null) {
			throw new AccountException("Account not exists");
		}
		
		return account;
		
	}
	
	
	@PutMapping("/depositAmount/{accountNo}/{balance}")
	public Account depositAmount(@PathVariable("accountNo")Integer accountNo,@PathVariable("balance")Integer balance) throws AccountException {
		Account account=accountRepo.findById(accountNo).get();
		
		if(account==null) {
			throw new AccountException("Account not exists");
		}
		
		account.setBalance(account.getBalance()+balance);
		
		accountRepo.save(account);
		
		return account;
	}
	
	
	@PutMapping("/withdrawAmount/{accountNo}/{balance}")
	public Account withdrawAmount(@PathVariable("accountNo")Integer accountNo,@PathVariable("balance")Integer balance) throws AccountException, InsufficientFundException {
		Account account=accountRepo.findById(accountNo).get();
		
		if(account==null) {
			throw new AccountException("Account not exists");
		}
		
		if(account.getBalance()>balance) {
			throw new InsufficientFundException("Paisa nehi re baba");
		}
		
		account.setBalance(account.getBalance()-balance);
		
		return account;
	}
	
	@PutMapping("/transferAmount")
	public String transferAmount(@RequestBody AccountDTO accountDTO) throws InsufficientFundException, AccountException {
		
		Account account=accountRepo.findById(accountDTO.getDesAccno()).get();
		
		if(account==null) {
			throw new AccountException("Account not exists");
		}
		
		if(account.getBalance()>accountDTO.getAmount()) {
			throw new InsufficientFundException("Paisa nehi re baba");
		}
		
		return "Done";
		
	}
	
	
}
