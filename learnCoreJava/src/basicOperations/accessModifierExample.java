package basicOperations;

public class accessModifierExample 
{
	private int prvNum;
	static String stc = "";
	public final String prog = "Java";
	
	static void functionStatic()
	{
		stc = "static function called to set static method";
	}
	
	public void functionPublic(int num)
	{
		System.out.println("Public method called - this in turn calls protected function to set the private variable");
		setPrivateVar(num);
	}
	
	private void setPrivateVar(int a)
	{
		prvNum = a;
	}
	
	protected void functionProtected()
	{
		System.out.println("The value of the private variable is:"+prvNum);
	}
}
