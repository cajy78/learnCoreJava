package collections;
import java.util.ArrayList;
import java.util.Collections;
public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> mobiles = new ArrayList<String>();
		mobiles.add("Apple iPhone XR");
		mobiles.add("Samsung Galaxy S10");
		mobiles.add("Asus ROG Phone");
		mobiles.add("Oneplus 6T");
		mobiles.add("OPPO Reno");
		
		System.out.println("The size of the Array is: "+ mobiles.size());
		System.out.println("The first mobile phone in the list is: "+ mobiles.get(0));
		
		System.out.println("Before sorting:");
		for(String i : mobiles)
		System.out.println(i);
		
		Collections.sort(mobiles);
		
		System.out.println("after sorting:");
		for(String i : mobiles)
			System.out.println(i);
		
		if(mobiles.contains("Apple iPhone"))
		{
			System.out.println("ArrayList contains iPhone");
		}
		else
			{
				if(mobiles.isEmpty())
				{
			
				}
			}
		
	}

}
