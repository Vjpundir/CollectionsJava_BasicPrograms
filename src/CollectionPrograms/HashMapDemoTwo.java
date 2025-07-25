package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemoTwo {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();

		hashMap.put(1, "vijay");
		hashMap.put(2, "sandy");
		hashMap.put(3, "Yash");
		hashMap.put(4, "Agastya");

		System.out.println(hashMap.size());

		System.out.println(hashMap.entrySet());

		System.out.println("Iterate via Iterator interface");

		Iterator<Entry<Integer, String>> it = hashMap.entrySet().iterator();
		{

			while (it.hasNext()) {
				Entry<Integer, String> entry = it.next();

				System.out.println(entry.getKey() + "=>" + entry.getValue());

			}

		}

		System.out.println("Changing hashMap into HashSet below");

		HashSet<Integer> set = new HashSet<>(hashMap.keySet());

		System.out.println("keys as HashSet" + set);

		System.out.println("Reverse the set collection by using Array list");

		ArrayList<Integer> list = new ArrayList<>(set);

		Collections.reverse(list);

		System.out.println(list);

	}

}
