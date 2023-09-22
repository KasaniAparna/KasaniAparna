package collectionsDemo;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet <String> cities = new HashSet<> ();

cities.add("Paris");
cities.add("US");
cities.add("Hyd");
cities.add("Delhi");
cities.add("Aus");

for(String t: cities)
{
	System.out.println(t);
}
System.out.println(cities.size());
System.out.println(cities.contains("UK"));











	}

}
