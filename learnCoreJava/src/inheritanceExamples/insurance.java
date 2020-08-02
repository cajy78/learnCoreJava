package inheritanceExamples;

public abstract class insurance {
	protected String insuranceHolder;
	protected int age;
	protected long insurnaceNumber;
	protected String location;
	protected long customerID;
	private long salary;
	
	public abstract void getinsuranceHolder(String name);
	
	int getAge(int age)
	{
		this.age = age;
		return age;
	}
	
	public double calculatePremium()
	{
		double insuranceAmt = salary /age;
		return insuranceAmt;
	}
}
