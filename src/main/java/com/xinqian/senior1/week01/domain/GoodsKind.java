package com.xinqian.senior1.week01.domain;

public class GoodsKind {
	private Integer kid;
	private String kname;
	public GoodsKind() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsKind(Integer kid, String kname) {
		super();
		this.kid = kid;
		this.kname = kname;
	}
	public Integer getKid() {
		return kid;
	}
	public void setKid(Integer kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	@Override
	public String toString() {
		return "GoodsKind [kid=" + kid + ", kname=" + kname + "]";
	}
	
}
