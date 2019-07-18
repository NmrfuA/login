package dbtest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.exceptions.RSAException;

public class Login {

	static Integer getAll() {
	    Connection con = conn.getConn();
	    //String sql = "select * from login";
	    String sql = "select password from login where"+" id="+Json.getid();
	    System.out.println(sql);
	    System.out.println(Json.getpassword());
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)con.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        
	        int col = rs.getMetaData().getColumnCount();
	        System.out.println("============================");
	        while (rs.next()) {
	            for (int i = 1; i <= col; i++) {
	                System.out.print(rs.getString(i) + "\t");
	                if ((i == 2) && (rs.getString(i).length() < 8)) {
	                    System.out.print("\t");
	                }
	             }
	            System.out.println("");
	        }
	            System.out.println("============================");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	
	static void check()
	{
		
		Connection con= conn.getConn();
	    String sql = "select password from login where"+" id= "+Json.getid();
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)con.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        int col = rs.getMetaData().getColumnCount();
	        System.out.println(col);
	        if(rs.next()) 
	        {
	        	String tempString=rs.getString(1);
	        	System.out.println(tempString);
	        if (tempString.contentEquals(Json.getpassword()))
	        {	
	        	Json.permitJsonMake();
	        }
				else
				{
				Json.rejectJsonMake();
				}
	        }
	    }catch (SQLException e) {
	    	e.printStackTrace();
		}
		
			
		
	}
}
