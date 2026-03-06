package collectionstest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
	ArrayList<String> ar = new ArrayList<String>();
	ar.add("red");
	ar.add(null);
	ar.add("blue");
	ar.add("purple");
	ar.add("orange");
	System.out.println(ar);
	
	
	ArrayList<String> li = new ArrayList<String>();
	li.add("a");
	li.add("e");
	li.add("i");
	li.add("o");
	System.out.println(li);
	
	//addAll() : 
	System.out.println(ar.addAll(li));
	System.out.println(ar);
	
	//containsAll() : to check whether a list is present in another list
	System.out.println(ar.containsAll(li));
	System.out.println(li.containsAll(ar));
	
	
	//clear() : 
	ar.clear();
	System.out.println(ar);
	
	//iterator program : - can be used in collections,list,set etc
	Iterator<String> it =li.iterator(); //it : variable name
	while(it.hasNext()) {
	System.out.println(it.next());
	}
	
	System.out.println(li);
	it.remove();
	System.out.println(li);
	}}
