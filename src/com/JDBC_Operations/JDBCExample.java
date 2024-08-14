package com.JDBC_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	static final String DB_URl = "jdbc:mysql://127.0.0.1:3306/alias";
	static final String User = "root";
	static final String Pass = "L@bs#224";
	static final String Query = "Select book_no, tittle, sub_code, author from bok_det";


	public static void main(String[] args) {
		try(Connection conn = DriverManager.getConnection(DB_URl, User,Pass);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(Query);
				){
			while (rs.next()) {
		
		System.out.println("Bno: "+ rs.getString("boo_no"));
		System.out.println("tit: "+ rs.getString("tittle"));
		System.out.println("scode: "+ rs.getString("author"));
		System.out.println("aut: "+ rs.getString("author"));
	}
		} catch (SQLException e) {
           e.printStackTrace();
}}}
