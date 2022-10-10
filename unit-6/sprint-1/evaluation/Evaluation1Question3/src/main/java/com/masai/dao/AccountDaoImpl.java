package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Account;

public class AccountDaoImpl implements AccountDao{

	@Override
	public Account findById(int id) {
		Account account=null;
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		account=entityManager.find(Account.class, id);
		
		return account;
	}

	@Override
	public String save(Account account) {
		String message="Wrong Entry.";
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		
		if(account!=null) {
			
			entityManager.getTransaction().begin();
			entityManager.persist(account);
			entityManager.getTransaction().commit();
			
			entityManager.clear();
			
			message="Register Successfully.";
			
		}
		
		
		return message;
	}

	@Override
	public String deleteAccountById(int id) {
		String message="Not Exists.";
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Account account=entityManager.find(Account.class, id);
		
		if(account!=null) {
			
			entityManager.getTransaction().begin();
			entityManager.remove(account);
			entityManager.getTransaction().commit();
			
			entityManager.clear();
			
			message="Removed.";
			
		}

		
		return message;
	}

	@Override
	public String withdraw(double amount, int accountId) {
		String message="Not Exists.";
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Account account=entityManager.find(Account.class, accountId);
		
		if(account!=null) {
			
			entityManager.getTransaction().begin();
			account.setBalance(account.getBalance()-amount);
			entityManager.getTransaction().commit();
			
			entityManager.clear();
			
			message="Withdraw Done.";
			
		}
		
		return message;
	}

	@Override
	public String deposit(double amount, int accountId) {
		String message="Not Exists.";
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Account account=entityManager.find(Account.class, accountId);
		
		if(account!=null) {
			
			entityManager.getTransaction().begin();
			account.setBalance(account.getBalance()+amount);
			entityManager.getTransaction().commit();
			
			entityManager.clear();
			
			message="Deposited.";
			
		}
		
		return message;
		
	}

}
