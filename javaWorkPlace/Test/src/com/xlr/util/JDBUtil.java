
package com.xlr.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xlr.model.Audio;
import com.xlr.model.OneCategoey;
import com.xlr.model.TwoCategory;
public class JDBUtil {
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/shuidi?characterEncoding=utf8";
	private static final String username = "root";
	private static final String password = "vjEj31NP8x";
	PreparedStatement pstmt;
	ResultSet rs;
	Statement stmt;
	public static Connection getConnection() {
		Connection con= null;
		try {
			Class.forName(driver);
			con= DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	} 
	public static void close(Connection con, Statement stmt, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (con != null) {
				con.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
public List<Audio> getUsername(String search){
		
		Connection con = JDBUtil.getConnection();
		List<Audio> audiors = new ArrayList<>();
		StringBuffer sb = new StringBuffer();
	    sb.append("SELECT");
	    sb.append(" id");
	    sb.append(",name");
	    sb.append(",path1");
	    sb.append(",flag");
	    sb.append(",belong ");
	    sb.append("FROM ");
	    sb.append("audio ");	
	    sb.append("WHERE ");
	    sb.append("flag=1");
	   
	    if(search != null){
	    	sb.append(" name like ").append("'%").append(search).append("%'");
	    }
	    String sql = sb.toString();
	    System.out.println(sql);		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();		
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String path= rs.getString(3);
				int flag = rs.getInt(4);
				int belong = rs.getInt(5);
				Audio audior = new Audio(id,name,path,flag,belong, path, belong, path);				
				audiors.add(audior);
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBUtil.close(con,stmt,pstmt,rs);
		}		
		return audiors;
	}
public List<OneCategoey> getOneCategory() {
	Connection con = JDBUtil.getConnection();
	List<OneCategoey> one_categorys = new ArrayList<>();
	String sql = "SELECT * FROM one_category";
	try {
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();	
		while(rs.next()){
			int id = rs.getInt(1);
			String name = rs.getString(2);
			OneCategoey one_category = new OneCategoey(id,name);		
			one_categorys.add(one_category);
		}	
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		JDBUtil.close(con, stmt, pstmt, rs);
	}
	return one_categorys;
}	
public List<TwoCategory> getTwoCategory(){
	
	Connection con= JDBUtil.getConnection();
	List<TwoCategory> two_categorys = new ArrayList<>();
	String sql = "SELECT * FROM two_category";
	try {
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()){
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int belong = rs.getInt(3);
			TwoCategory two_category = new TwoCategory(id,name,belong);		
			two_categorys.add(two_category);
		}		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		JDBUtil.close(con, stmt, pstmt, rs);
	}	
	return two_categorys;
}
}
