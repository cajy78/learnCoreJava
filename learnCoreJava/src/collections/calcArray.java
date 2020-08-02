package collections;
import java.util.ArrayList;

public class calcArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int res=0;
		numbers.add(1);
		numbers.add(2);
		numbers.add(123);
		numbers.add(12345);
		
		for(int i : numbers)
			res = res + i;

		System.out.println(res);
	}

}
