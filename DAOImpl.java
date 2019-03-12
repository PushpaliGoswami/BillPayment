package model;

import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
public class DAOImpl implements DAO{

	public int insert(String query)throws Exception{
		Connection con=MyConn.getObj().crtCon();
		Statement ps=con.createStatement();
		
				int i=ps.executeUpdate(query);
				return i;
	}
	public int update(String query){return 0;}
	public int delete(String query){return 0;}
	public ResultSet select(String query)throws Exception{
		
		Connection con=MyConn.getObj().crtCon();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
				
				return rs;
		
	}
	
	
	
}
