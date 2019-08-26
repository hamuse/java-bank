package com.bitcamp3.domains;

public class AccountBean {
	  private String accountNum, today;
	  private int money;
	    
	    public void setAccountNum(String accountNum) {
	    	this.accountNum = accountNum;
	    }
	    public String getAccountNum() {
	    	return accountNum;
	    }
	    public void setToday(String today) {
	    	this.today = today;
	    }
	    public String getToday() {
	    	return today;
	    }
	   public void setMoney(int money) {
		   this.money = money;
	   }
	   public int getMoney() {
		   return money;
	   }
	   @Override
	public String toString() {
		return String.format("계좌정보"
				+ "계좌번호: %s \n"
				+ "거래일: %s \n"
				+ "돈: %d", accountNum, today, money);
	}
}
