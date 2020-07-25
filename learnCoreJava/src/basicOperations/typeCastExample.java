package basicOperations;
import java.util.Scanner;
public class typeCastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a value to be convereted to Float: ");
		Scanner s1 = new Scanner(System.in);
		String val = s1.nextLine();
		
		float conv = Float.parseFloat(val);
		System.out.println("The value entered is: "+conv);
		s1.close();

	}

}
