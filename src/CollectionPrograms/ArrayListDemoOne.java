package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListDemoOne {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Vijay");
		list.add("Sandy");
		list.add("Shakti");
		list.add("Agastya");
		list.add("Raghuraj");
		list.add("Rachin");
		list.add("Raj");
		list.add("Raj");
		list.add("Raj");
		list.add("Soniya");
		list.add("Tanu");
		list.add("Sidhu");
		list.add("Sidhu");
		list.add("Sidhu");
		list.add("Yash");
		list.add("Vijay");
		list.add("Zack");

		// System.out.print(list);
		Collections.sort(list);

		System.out.print("Sorted array list is :" + list);

//		for(String s: list)
//		{
//			System.out.println(s+ " ");
//		}

		System.out.println("\n"); // just to change the line
		
		// Converting Array list to set collection

		HashSet<String> set = new HashSet<>(list);

		System.out.println("Convert the Array list to Set and then Using print the data");

		System.out.println("\n"); // just to change the line
		
		System.out.println(set);

	}

}
