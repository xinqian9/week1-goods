package com.xinqian.senior1.week01.domain;

public class Condition {
	private Integer pageNum;
	private String gcname;
	public Condition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Condition(Integer pageNum, String gcname) {
		super();
		this.pageNum = pageNum;
		this.gcname = gcname;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public String getGcname() {
		return gcname;
	}
	public void setGcname(String gcname) {
		this.gcname = gcname;
	}
	@Override
	public String toString() {
		return "Condition [pageNum=" + pageNum + ", gcname=" + gcname + "]";
	}
	
}
