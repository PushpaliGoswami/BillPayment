package model;

import java.sql.*;

public interface DAO {
	int insert(String query)throws Exception;
	int update(String query);
	int delete(String query);
	ResultSet select(String query)throws Exception;
}
