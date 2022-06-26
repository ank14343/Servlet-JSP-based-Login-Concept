package com.arya.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
	
	String url = "jdbc:mysql://localhost:5431/testdb";
	String username = "root";
	String password = "root";
	
	public boolean doAuthenticate(String uname) {
		
		Connection con;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			String query = "select * from user where username = ?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uname);
			
			System.out.println("query :: " + st.toString());
			
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return false;
	}

}
