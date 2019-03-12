package controller;
import java.sql.*;

import model.DAOImpl;
public class Bean1 {
	public String buildQuery(String id,String pswd)throws Exception
	{
		DAOImpl daoimpl=new DAOImpl();
		String query="select usertype from user_tab where userid='"+id+"' and password='"+pswd+"'";
		ResultSet rs=daoimpl.select(query);
		if(rs.next())
		return rs.getString(1);
		else
		return "Invalid userid and password";
	}
}
