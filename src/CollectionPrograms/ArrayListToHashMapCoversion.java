package CollectionPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayListToHashMapCoversion {

	public static void main(String[] args) {


		ArrayList <String> list = new ArrayList<>();
		
		list.add("Banana");
		list.add("Apple");
		list.add("Mango");
		
		System.out.println(list);
		
		
		//converting ArrayList to hashMap collection
		
		HashMap<Integer,String> map = new HashMap<>();
		
		for(int i=0; i<list.size();i++)
		{
			map.put(i, list.get(i));
			
		}
		
			System.out.println(map);
			
			Iterator<Entry<Integer,String>>it = map.entrySet().iterator();
			
			System.out.println("Iterator is travesing to each element");
			
			while(it.hasNext())
			{
				
				Entry<Integer,String>entry =it.next();
			
				System.out.println("key is : " + entry.getKey() + " Value is : " + entry.getValue());
			}
		}
		

	}
