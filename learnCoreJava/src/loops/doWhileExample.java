package loops;

public class doWhileExample {
	private static int ctr=0;
	public static void runDoWhile()
	{
		do
		{
			System.out.println("Counter is: "+ctr);
			ctr++;
		}while(ctr<=10);
	}
}
