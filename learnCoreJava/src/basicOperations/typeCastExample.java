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
		
		//implicit type cast.
		int i = 10;
		long l = i;
		float f = l;
		System.out.println("Example of int: "+i);
		System.out.println("Example of int to long: "+l);
		System.out.println("Example of long: "+f);
		
		//explicit type casting
		double d = 100.100;
		f = (float)d;
		l = (long)f;
		i = (int)l;
		
		System.out.println("Example of double: "+d);
		System.out.println("Example of double to float (Explicit caste): "+f);
		System.out.println("Example of float to long (explicit): "+l);
		System.out.println("Example of long to int (explicit): "+i);

	}

}
