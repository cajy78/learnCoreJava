package jdbcConnect;
//import java.sql.ResultSet;

public class jdbcExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			dbConnect db = new dbConnect();
			//db.retrieveData();
			
			if(db.insertData()==1)
				System.out.println("Row Added");
			else
				System.out.println("error occured in update");
			db.retrieveData();
		}
		catch(Exception e)
		{
			System.out.println("Exception in main");
			e.printStackTrace();
		}
		finally
		{
		}
	}

}
