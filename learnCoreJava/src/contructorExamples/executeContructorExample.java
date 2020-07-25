package contructorExamples;

import java.util.Scanner;

public class executeContructorExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		int res;
		do
		{
			System.out.println("Welcome to the Employee Master:");
			System.out.println("Enter the Employee's First Name:");
			String fName = s1.nextLine();
			System.out.println("Enter the Employee's Last Name:");
			String lName = s1.nextLine();
			System.out.println("Enter the Employee's Location City:");
			String city = s1.nextLine();
			employeeMaster emp = new employeeMaster(fName, lName, city);
			System.out.println("New Employee's ID:"+emp.getEmpID());
			System.out.println("New Employee's Name:"+emp.getFirstName()+" "+emp.getLastName());
			System.out.println("New Employee's location:"+emp.getLocation());
			System.out.print("Would you like to create a new Employee, Yes or No:");
			res = s1.nextInt();
		}while(res==1);
		s1.close();
	}

}
