package controller;
import java.sql.*;

import model.DAOImpl;
public class Bean {
	public int buildQuery(String first,String last,String age,String gender,String phno,String pan,String aadhar,String id,String pswd,String type)throws Exception
	{
		DAOImpl daoimpl=new DAOImpl();
		String query="insert into user_tab values('"+first+"','"+last+"','"+age+"','"+gender+"','"+phno+"','"+pan+"','"+aadhar+"','"+id+"','"+pswd+"','"+type+"')";
		System.out.print(query);
		int i=daoimpl.insert(query);
		if(i>0)
		
		return 1;
		
		else
		return 0;
	}
}
