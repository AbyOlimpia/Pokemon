package src.pokemon;
   

import java.sql.*;
public class SQLFuncional{
	public static void main(String[] args) {
		System.out.println("MySQL Connect Example.");
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "pok_mon";
		String driver = "com.mysql.cj.jdbc.Driver";
		String userName = "root";
		String password = "";
		String f1;
		int f2;
		String f3;
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		try {
			Class.forName(driver).getDeclaredConstructor().newInstance();
			conn = DriverManager.getConnection(url+dbName,userName,password);
			String query = "Select * FROM pokedex";
			System.out.println("Connected to the database");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next())
			{
				f1 = rs.getString(1);
				f2 = rs.getInt(2);
				f3 = rs.getString(3);
				System.out.println(f1+" "+f2+" "+f3);
			} //end while


			try {
				Class.forName(driver).getDeclaredConstructor().newInstance();
				conn = DriverManager.getConnection(url+dbName,userName,password);
				query = "Select * FROM movimiento";
				System.out.println("Connected to the database");
				stmt = conn.createStatement();
				rs = stmt.executeQuery(query);
				while (rs.next())
				{
					f1 = rs.getString(1);
					f2 = rs.getInt(2);
					f3 = rs.getString(3);
					System.out.println(f1+" "+f2+" "+f3);
				} //end while










				conn.close();
				System.out.println("Disconnected from database");
			} //end try
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		} 
	}
}	

