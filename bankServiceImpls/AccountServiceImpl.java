package bankServiceImpls;

import com.bitcamp3.domains.AccountBean;

import bankServices.AccountService;

public class AccountServiceImpl implements AccountService {
	 private AccountServiceImpl[] accountService;
	 private AccountBean bean;
	 private int count;
	 private AccountService sevice;
	 
	 public AccountServiceImpl() {
		 accountService = new AccountServiceImpl[10];
		 count = 0;
	}
	
	@Override
	public void createAccount(int money) { //저장공간 
		String[] don = new String[count]; 
		don[count]= String.valueOf(bean.getMoney());
    accountService[count] = don[count];
	
	  
				
	}

	@Override
	public String createAccountNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccounts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void depositMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}

	
}
