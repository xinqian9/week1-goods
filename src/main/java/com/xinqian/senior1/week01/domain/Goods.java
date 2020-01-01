package com.xinqian.senior1.week01.domain;

public class Goods {
	private Integer gid;
	private String gcname;
	private String gename;
	private Integer bid;
	private Integer kid;
	private Double gsize;
	private Double gprice;
	private Integer gnum;
	private String glabel;
	private String gimg;
	private Brand brand;
	private GoodsKind goodsKind;
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(Integer gid, String gcname, String gename, Integer bid, Integer kid, Double gsize, Double gprice,
			Integer gnum, String glabel, String gimg, Brand brand, GoodsKind goodsKind) {
		super();
		this.gid = gid;
		this.gcname = gcname;
		this.gename = gename;
		this.bid = bid;
		this.kid = kid;
		this.gsize = gsize;
		this.gprice = gprice;
		this.gnum = gnum;
		this.glabel = glabel;
		this.gimg = gimg;
		this.brand = brand;
		this.goodsKind = goodsKind;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGcname() {
		return gcname;
	}
	public void setGcname(String gcname) {
		this.gcname = gcname;
	}
	public String getGename() {
		return gename;
	}
	public void setGename(String gename) {
		this.gename = gename;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getKid() {
		return kid;
	}
	public void setKid(Integer kid) {
		this.kid = kid;
	}
	public Double getGsize() {
		return gsize;
	}
	public void setGsize(Double gsize) {
		this.gsize = gsize;
	}
	public Double getGprice() {
		return gprice;
	}
	public void setGprice(Double gprice) {
		this.gprice = gprice;
	}
	public Integer getGnum() {
		return gnum;
	}
	public void setGnum(Integer gnum) {
		this.gnum = gnum;
	}
	public String getGlabel() {
		return glabel;
	}
	public void setGlabel(String glabel) {
		this.glabel = glabel;
	}
	public String getGimg() {
		return gimg;
	}
	public void setGimg(String gimg) {
		this.gimg = gimg;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public GoodsKind getGoodsKind() {
		return goodsKind;
	}
	public void setGoodsKind(GoodsKind goodsKind) {
		this.goodsKind = goodsKind;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gcname=" + gcname + ", gename=" + gename + ", bid=" + bid + ", kid=" + kid
				+ ", gsize=" + gsize + ", gprice=" + gprice + ", gnum=" + gnum + ", glabel=" + glabel + ", gimg=" + gimg
				+ "]";
	}
	
}
