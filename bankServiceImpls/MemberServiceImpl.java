package bankServiceImpls;

import com.bitcamp3.domains.AdminBean;
import com.bitcamp3.domains.CustomerBean;
import com.bitcamp3.domains.MemberBean;

import bankServices.MemberService;

public class MemberServiceImpl implements MemberService {
    private CustomerBean[] customers; 
    private AdminBean[] admins;
    private MemberBean[] members;
    private int count;
	public MemberServiceImpl() {
		customers = new CustomerBean[10];
		admins = new AdminBean[10];
		members = new MemberBean[10];
		count = 0;
			}
	@Override
	public void join(CustomerBean param) {
	
      	customers[count] = param;
      	count++;
     
	}

	@Override
	public CustomerBean[] findAllCustomers() {
        for(int i =0 ; i < count; i++) {
        	
        	customers[i].toString();
        }
		return customers;
	}

	@Override
	public AdminBean[] findAllAdmins() {
		return null;
	}

	@Override
	public MemberBean[] findByName(String name) {
	   MemberBean[] beans = new MemberBean[count];
			for(int i =0; i < count; i++) {
				if(name.equals(members[i].getName())) {
					beans[i] = members[i];
				
				}
			}
		return beans;
	}

	@Override
	public MemberBean findById(String id) {
       MemberBean bean = new MemberBean();
       for(int i = 0; i < count; i++) {
    	    if(id.equals(members[i].getId())) {
    	    	bean = members[i];
    	    }
       }
		return bean;
	}

	@Override
	public boolean login(MemberBean param) {
		for(int i = 0; i< count; i++) {
			if(param.getId().equals(members[i].getId()) && param.getPw().equals(members[i].getPw())) {
				
			}
		}
		return true;
	}

	@Override
	public int countCustomers() {
		return customers.length ;
	}

	@Override
	public int countAdmins() {
				return admins.length;
	}

	@Override
	public boolean existId(String id) {
		for(int i = 0; i <count; i++  ) {
			if(id.equals(members[i].getId())) {
				
				break;
			}
		}
		return true;
	}

	@Override
	public void updatePass(MemberBean param) {
		String id = param.getId();
		String pw = param.getPw();
		String[] arr = pw.split(",");
		String oldPw = arr[0];
		String newPw = arr[1];
     for(int i = 0; i <count ; i++) {
    	 if(param.getId().equals(members[i].getId()) && param.getPw().equals(members[i].getPw())) {
    		 members[i].setPw(newPw);
    	 }
     }		
	}

	@Override
	public void deleteMember(MemberBean param) {
		// TODO Auto-generated method stub
		
	}


}
