package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args) {
	
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(44);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(8);
		set.add(88);
		set.add(01);
		set.add(40);
		set.add(23);
		
		ArrayList<Integer> lists = new ArrayList<>(set);
		
		for(Integer s:set)
		  {
			System.out.print(s + " ");
		
		   }
		
		Collections.reverse(lists);	
		
		System.out.println("\n"); // just to change the line
		
		System.out.println("Arraylist is in reverse order collection");
		
		System.out.println(lists);
	}

}
