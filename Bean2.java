package controller;

import java.sql.ResultSet;

import model.DAOImpl;

public class Bean2 {
	public String buildQuery(String id,String pswd)throws Exception
	{
		DAOImpl daoimpl=new DAOImpl();
		String query="select first_name from user_tab where userid='"+id+"' and password='"+pswd+"'";
		ResultSet rs=daoimpl.select(query);
		if(rs.next())
		return rs.getString(1);
		else
		return "Invalid userid and password";
	}
}
