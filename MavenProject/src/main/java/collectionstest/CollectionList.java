package collectionstest;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
	List <String> li = new ArrayList<String>();
	System.out.println(li);
	//add() method - to add the elements into the list
	
	li.add("red");
	li.add("blue");
	li.add(null);
	li.add("blue");
	li.add(null);
	li.add("orange");
	System.out.println(li);
	
	//indexOf() : to return the index of the particular element in the collection
	System.out.println(li.indexOf("blue")); //it will take 1st occurance
	

//lastIndexOf() : to return the last index of the particular element when it have repeated element
	System.out.println(li.lastIndexOf("blue")); // top -to bottom approach, last index
	
	//remove() : to remove the elements based on the index position based on object, index
	System.out.println(li.remove(2)); //based on index number
	
	System.out.println(li.remove("blue")); //based on object
	System.out.println(li); //after removing printing the entire list 
	
	//get() : retrieving the object in the list ,it is also based on index
	System.out.println(li.get(1));
	System.out.println(li.getFirst());
	
	//contains() : to check whether an object is present or not present - true , else - false
	System.out.println(li.contains("red"));
	System.out.println(li.contains("RED"));
	
	
	//isEmpty() : to check whether the element is empty or not :
	System.out.println(li.isEmpty());
	
	//size() : to find the collection's length
	System.out.println(li.size());
	
	for(int i =0; i<li.size();i++) {
	System.out.println(li.get(i));
	}
	
	for(String var : li) //for non-generic, instead of this String, we use object 
	{
		System.out.println(var);
	}
}}
