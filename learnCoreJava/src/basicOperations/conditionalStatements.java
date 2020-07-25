package basicOperations;
import java.util.Scanner;
public class conditionalStatements {

	public static void main(String[] args) {
		//This is a progammatic demo of IF..Else in Java.
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char a = s1.nextLine().charAt(0);
		if(a=='y')
		{
			System.out.println("You've entered Yes");
		}
		else
		{
			System.out.println("The character you've entered is: "+a);
		}
		s1.close();

	}

}
