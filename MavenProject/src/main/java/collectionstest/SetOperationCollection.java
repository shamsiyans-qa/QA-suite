package collectionstest;

import java.util.HashSet;
import java.util.Set;

public class SetOperationCollection {

	public static void main(String[] args) {
	
		Set<String> set1 = new HashSet<String>();
		//add : 
		
		set1.add("bus");
		set1.add(null);
		set1.add("car");
		set1.add("car");
		set1.add(null);
		set1.add("bike");
		set1.add("bus");
		set1.add("truck");
		System.out.println(set1); //not based on indexing ;it always shown in shuffle mode
		System.out.println(set1.remove("bus"));
		System.out.println(set1); //isEmpty ,contains extc can also be write 

		
	}

}
