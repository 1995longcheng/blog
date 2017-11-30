package com.blog.friend.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//它是总的连接数据的一个工具类                                       
public abstract class BlogDao implements TestBlogDao {

	// 驱动类的名字
	private static final String driverClass = "com.oracle.jdbc.Driver";
	// url
	private static final String url = "jdbc:oracle://localhost:1521/orcl";
	private static final String username = "blog";
	private static final String password = "tiger";

	/* (non-Javadoc)
	 * @see com.blog.friend.dao.TestBlogDao#getConn()
	 */
	public Connection getConn() {
		Connection con = null;
		try {
			Class.forName("oracle.jdk.driver.OracleDriver");
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	/* (non-Javadoc)
	 * @see com.blog.friend.dao.TestBlogDao#close(java.sql.Connection, java.sql.Statement, java.sql.ResultSet)
	 */
	public void close(Connection con, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static String getDriverclass() {
		return driverClass;
	}

}
