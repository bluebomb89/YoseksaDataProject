package com.sist.dao;

public class YoseksaAllVO {
	// FoodVO
	private int no=0;
	private String name="";
	private String addr="";
	private int score=0;
	private int count=0;
	private String category="a";
	
	// MonthVO
//	private String no; no는 foodvo의 Foreigner KEY이기 때문에 작성 X
	private int jan=0;
	private int feb=0;
	private int mar=0;
	private int apr=0;
	private int may=0;
	private int june=0;
	private int jul=0;
	private int aug=0;
	private int sep=0;
	private int oct=0;
	private int nov=0;
	private int dec=0;
	
	// WordVO
//	private String no; no는 foodvo의 Foreigner KEY이기 때문에 작성 X
	private int wo_no=0;
	private String wo_img="";
	private String wo_key="";
	private int wo_bf=0;
	private int wo_ln=0;
	private int wo_dn=0;
	private int wo_ya=0;
	
	// 중복 확인용 변수
	private String firstLink="";
	
	// 몇개의 블로그 검색했는지 갯수
	
	
	public String getFirstLink() {
		return firstLink;
	}
	public void setFirstLink(String firstLink) {
		this.firstLink = firstLink;
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getJan() {
		return jan;
	}
	public void setJan(int jan) {
		this.jan = jan;
	}
	public int getFeb() {
		return feb;
	}
	public void setFeb(int feb) {
		this.feb = feb;
	}
	public int getMar() {
		return mar;
	}
	public void setMar(int mar) {
		this.mar = mar;
	}
	public int getApr() {
		return apr;
	}
	public void setApr(int apr) {
		this.apr = apr;
	}
	public int getMay() {
		return may;
	}
	public void setMay(int may) {
		this.may = may;
	}
	public int getJune() {
		return june;
	}
	public void setJune(int june) {
		this.june = june;
	}
	public int getJul() {
		return jul;
	}
	public void setJul(int jul) {
		this.jul = jul;
	}
	public int getAug() {
		return aug;
	}
	public void setAug(int aug) {
		this.aug = aug;
	}
	public int getSep() {
		return sep;
	}
	public void setSep(int sep) {
		this.sep = sep;
	}
	public int getOct() {
		return oct;
	}
	public void setOct(int oct) {
		this.oct = oct;
	}
	public int getNov() {
		return nov;
	}
	public void setNov(int nov) {
		this.nov = nov;
	}
	public int getDec() {
		return dec;
	}
	public void setDec(int dec) {
		this.dec = dec;
	}
	public int getWo_no() {
		return wo_no;
	}
	public void setWo_no(int wo_no) {
		this.wo_no = wo_no;
	}
	public String getWo_img() {
		return wo_img;
	}
	public void setWo_img(String wo_img) {
		this.wo_img = wo_img;
	}
	public String getWo_key() {
		return wo_key;
	}
	public void setWo_key(String wo_key) {
		this.wo_key = wo_key;
	}
	public int getWo_bf() {
		return wo_bf;
	}
	public void setWo_bf(int wo_bf) {
		this.wo_bf = wo_bf;
	}
	public int getWo_ln() {
		return wo_ln;
	}
	public void setWo_ln(int wo_ln) {
		this.wo_ln = wo_ln;
	}
	public int getWo_dn() {
		return wo_dn;
	}
	public void setWo_dn(int wo_dn) {
		this.wo_dn = wo_dn;
	}
	public int getWo_ya() {
		return wo_ya;
	}
	public void setWo_ya(int wo_ya) {
		this.wo_ya = wo_ya;
	}
	
	
	
}
