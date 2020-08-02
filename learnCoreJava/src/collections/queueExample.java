package collections;
import java.util.*;
public class queueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> countries = new PriorityQueue<String>();
		countries.add("India");
		countries.add("United Kingdom");
		countries.add("USA");
		countries.add("Egypt");
		countries.add("Australia");
		
		Iterator<String> i = countries.iterator();
		
		while(i.hasNext())
			System.out.println(i.next());
		
		Comparator comp = (Comparator<String>) countries.comparator();
		comp.reversed();
		
		while(i.hasNext())
		System.out.println(i.next());
	}

}
