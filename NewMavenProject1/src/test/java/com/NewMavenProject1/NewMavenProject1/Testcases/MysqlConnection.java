package com.NewMavenProject1.NewMavenProject1.Testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class MysqlConnection {
	@Test
	public void test() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("hi");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahesh","root","mahesh");
		System.out.println("mysql connect");
		
	}

}
