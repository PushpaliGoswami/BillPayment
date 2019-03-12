package model;

import java.sql.*;


public class MyConn {
	private static String driver="oracle.jdbc.driver.OracleDriver";
	private static String url="jdbc:oracle:thin:@localhost:1521:XE";
	private MyConn(){}
	private static MyConn mc=new MyConn();
	public static MyConn getObj()
	{return mc;}
	public static Connection crtCon()throws Exception
	{
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,"billpayment","password");
		return con;
	}
}
