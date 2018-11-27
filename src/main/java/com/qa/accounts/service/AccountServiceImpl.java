package com.qa.accounts.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.accounts.persistence.domain.AccountNum;
import com.qa.accounts.repository.AccountRepository;
import com.qa.accounts.util.generators.CreateAccount;
import com.qa.accounts.util.generators.SixAccountGen;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository repo;
	
	private CreateAccount accountCreator;
	
	public String createAccountNumber() {
		List<String> allAccountNums = getAccountNumArray();
		
		accountCreator = new CreateAccount(new SixAccountGen() );
		accountCreator.getGenerator().setAccountNumList(allAccountNums);
		
		String generatedNum = accountCreator.createAccount();
		
		repo.save(new AccountNum(generatedNum));
		
		return generatedNum;
		
	}
	private List<String> getAccountNumArray() {
		List<AccountNum> objectList = repo.findAll();
		
		return objectList.stream().map(object -> object.getAccountNum()).collect(Collectors.toList());
	}
}
