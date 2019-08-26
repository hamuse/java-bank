package bankServices;

import com.bitcamp3.domains.AdminBean;
import com.bitcamp3.domains.CustomerBean;
import com.bitcamp3.domains.MemberBean;

public interface MemberService {
	public void join(CustomerBean param);
	public CustomerBean[] findAllCustomers();
	public AdminBean[] findAllAdmins();
	public MemberBean[] findByName(String name);
	public MemberBean findById(String id); 
	boolean login(MemberBean param);
	int countCustomers();
	int countAdmins();
	boolean existId(String id);
	void updatePass(MemberBean param);
	void deleteMember(MemberBean param);
         
}
