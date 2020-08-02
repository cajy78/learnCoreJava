package jdbcConnect;
import java.sql.*;
import java.util.Scanner;

public class dbConnect
{
	private final String dbCon = "jdbc:mysql://localhost:3306/mydatabase01";
	private final String userName = "root";
	private final String pwd = "1*2*3*Cajy";
	
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;
	private static PreparedStatement ps;
	private Scanner s1 = new Scanner(System.in);
	
	public void retrieveData()
	{
		String query = "Select * from customer";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbCon, userName, pwd);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt("cust_ID") + " " + rs.getString("Name") + " " + rs.getString("city")+ " " + rs.getString("Mobile_no"));
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in function start");
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}
			catch(Exception e)
			{
				System.out.println("Exception in function end");
			}
		}
		//return rs;
	}
	
	public int insertData()
	{
		int outcome = 0;
		String insQuery = "insert into customer(Name, City, Mobile_no) values (?,?,?)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbCon, userName, pwd);
			
			ps = con.prepareStatement(insQuery);
			System.out.println("Customer Name:");
			ps.setString(1, s1.nextLine());
			System.out.println("City:");
			ps.setString(2, s1.nextLine());
			System.out.println("Mobile Number:");
			ps.setString(3, s1.nextLine());
			
			outcome = ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("Exception in function start");
			e.printStackTrace();
		}
		finally {
			try {
			}
			catch(Exception e)
			{
				System.out.println("Exception in function end");
			}
		}
		
		return outcome;
	}
	
}
