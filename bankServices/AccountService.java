package bankServices;

import com.bitcamp3.domains.AccountBean;

public interface AccountService {
	public void createAccount(int money);
	public String createAccountNum();
	public AccountBean[] findAll();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccounts();
	public boolean existAccountNum(String accountNum);
	public String findDate(); 
	public void depositMoney(AccountBean param);
	public void withdrawMoney(AccountBean param);
	public void deleteAccountNum(String accountNum);
}
