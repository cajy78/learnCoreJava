package contructorExamples;
import java.util.Random;
public class employeeMaster {

	private String empID;
	private String firstName;
	private String lastName;
	private String location;
	
	employeeMaster()
	{}
	
	employeeMaster(String fName, String lName, String city)
	{
		int empNum = new Random().nextInt();
		this.empID = "EMP"+ empNum;
		this.firstName = fName;
		this.lastName = lName;
		this.location = city;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getEmpID()
	{
		return empID;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getLocation()
	{
		return location;
	}
	
}
