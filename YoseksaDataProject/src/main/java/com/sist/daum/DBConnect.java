package com.sist.daum;

import java.sql.*;

import com.sist.dao.YoseksaAllVO;

public class DBConnect {
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;
	public void dbconnectgo() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
        /*System.out.println("OracleDriver 로딩 성공");*/
     conn=DriverManager.getConnection("jdbc:oracle:thin:@211.238.142.144:1521:ORCL","scott","tiger");
	}
	public String dbname(int pk) throws Exception{
			  String name="";
			  dbconnectgo();
		      Statement stmt = conn.createStatement();
		      ResultSet rs=stmt.executeQuery("select name from food where no="+pk);
		      if(rs.next()==true){
		    	  name=rs.getString("name");
		      }
//              System.out.println(rs.getString("addr"));
              rs.close(); 
	          stmt.close(); 
	          conn.close();
	          return name;
	}
	public int dbcount() throws Exception{
		int count=0;
		dbconnectgo();
	    Statement stmt = conn.createStatement();
	    ResultSet rs=stmt.executeQuery("select count(no) from food");
	    if(rs.next()==true){
	    	count=rs.getInt("count(no)");
	    }
	    System.out.println("카운트는="+count);
		return count;
	}
	public String dbaddr(int pk) throws Exception{
		  String addr="";
		  dbconnectgo();
	      Statement stmt = conn.createStatement();
	      ResultSet rs=stmt.executeQuery("select addr from food where no="+pk);
	      if(rs.next()==true){
	    	  addr=rs.getString("addr");
	      }
//        System.out.println(rs.getString("addr"));
        rs.close(); 
        stmt.close(); 
        conn.close();
        return addr;
	}
	public void dbInsert(YoseksaAllVO vo) throws Exception{
		dbconnectgo();
		Statement stmt = conn.createStatement();
//		INSERT INTO yoseksa_notice VALUES(#{notice_no},1,1,#{notice_sub},#{notice_content},SYSDATE,0)
		System.out.println(vo.getNo());
		System.out.println(vo.getName());
		System.out.println(vo.getAddr());
		System.out.println(vo.getScore());
		System.out.println(vo.getCount());
		System.out.println(vo.getCategory());
//		System.out.println("INSERT INTO food VALUES("+vo.getNo()+","+vo.getName()+","+vo.getAddr()+","+vo.getScore()+","+vo.getCount()+","+vo.getCategory()+")");
		stmt.executeQuery("INSERT INTO food VALUES("+vo.getNo()+",'"+vo.getName()+"','"+vo.getAddr()+"',"+vo.getScore()+","+vo.getCount()+")");
		stmt.executeQuery("INSERT INTO month VALUES("+vo.getNo()+","+vo.getJan()+","+vo.getFeb()+","+vo.getMar()+","+vo.getApr()+","+vo.getMay()+","+vo.getJune()+","+vo.getJul()+","+vo.getAug()+","+vo.getSep()+","+vo.getOct()+","+vo.getNov()+","+vo.getDec()+")");
//		stmt.executeQuery("INSERT INTO word VALUES()"); word 인서트
	}
}
