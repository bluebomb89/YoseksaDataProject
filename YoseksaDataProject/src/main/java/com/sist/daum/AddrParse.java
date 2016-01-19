package com.sist.daum;

public class AddrParse {
	public String getGu(String addr) throws Exception{
		String gu="";
		gu =  addr.substring(addr.indexOf(" ")+1, addr.indexOf(" ", 6));
		return gu;
	}
	public String getDong(String addr) throws Exception{
		String dong="";
		dong = addr.substring(addr.indexOf(" ", 8)+1, addr.indexOf("µ¿", 11)+1);
		return dong;
	}
}
