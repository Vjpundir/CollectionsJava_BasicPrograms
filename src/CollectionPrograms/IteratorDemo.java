package CollectionPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		
		HashSet<Integer> hs= new HashSet<>();
		
		for(int i=0; i<=5;i++)
		{
			hs.add(i);
//			System.out.println(hs);
//			
//			System.out.println(hs.size());
		}
		
		
		Iterator <Integer> it = hs.iterator();
		{
		
			while(it.hasNext())
				
			{
			  Integer result =it.next();
			  
			  {
				  if(result==4)
				  {
					  break;
				  }
				  
				  System.out.println(result);
			  }
			}
		}
		
		
		System.out.print("Result is coming from for each look");
		
		 for(Integer output:hs)
		{
		
			System.out.print("\n"+ output);
		}

	}

}
