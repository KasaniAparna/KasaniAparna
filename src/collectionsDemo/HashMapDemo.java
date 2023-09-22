package collectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <Integer,String> td = new HashMap<> ();
td.put(123,"Appu");
td.put(123,"Aparna");
td.put(1234,"Reddy");
td.put(12345,"Kasani");
for(Entry m: td.entrySet()) {
	System.out.println(m.getKey() + " - " +m.getValue()); 
	}
Set set = td.entrySet();
Iterator itr = set.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

td.remove("Appu"); 

	}

}
