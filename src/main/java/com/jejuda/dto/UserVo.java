package com.jejuda.dto;

public class UserVo {
	private int no;
	private String ca_title;
	
	
	@Override
	public String toString() {
		return "UserVo [no=" + no + ", ca_title=" + ca_title + "]";
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCa_title() {
		return ca_title;
	}
	public void setCa_title(String ca_title) {
		this.ca_title = ca_title;
	}
	
	
	
	
}
