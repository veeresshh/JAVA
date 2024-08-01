package Java;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionHashSet {

	public static void main(String[] args) {
	
// HashSet, TreeSet, LinkedHasSet Implements set interface
// Does not accept duplicate values
// There is no guarantee that element is stored in sequential order
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("USA");
		hs.add("UK");
		hs.add("Dubai");
		hs.add("India");	
		
		System.out.println(hs);
		
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
//Iterator
		
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext())
			
		{
			System.out.println(i.next());			
		}

	}

}
