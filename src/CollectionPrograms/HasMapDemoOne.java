package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HasMapDemoOne {

	
	public static void main(String[] args) {

		    HashMap<String,String> hashMap = new HashMap<>();
		    hashMap.put("USA","USD");
		    hashMap.put("India","INR");
		    hashMap.put("UK","GBP");
		   
		    
		    for(Map.Entry<String, String> entry:hashMap.entrySet())
		    {
		    	
		    	System.out.println(entry.getKey() +"==>"+ entry.getValue());	
	
		    }
		   
		    Iterator<Entry<String ,String>>it= hashMap.entrySet().iterator();
		    {
		    	while (it.hasNext())
		    	{
	    		System.out.println(it.next());
		    	}
		    }
		   
		    ArrayList<String>arr = new ArrayList<>(hashMap.values());
		    
		    Collections.sort(arr);
		    
		    System.out.println("Array list After sorting data");
		    
		    System.out.println(arr);
		    
		    System.out.println("Array list after reverse the order of data");
		    
  	        Collections.reverse(arr);
		    
		    System.out.println(arr);
		 
	}
}


