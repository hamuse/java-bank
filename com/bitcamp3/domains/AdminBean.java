package com.bitcamp3.domains;

public class AdminBean extends MemberBean {
	private String sabun;

	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getSabun() {
		return sabun;
	}
	
	@Override
	public String toString() {
		return String.format("관리자 \n"
				+ "사번: %s", sabun);
	}
}
