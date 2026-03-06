package stringprograms;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Shamsiya";
		String s1= new String("Shamsiya Program");
		String s2 = "";
		System.out.println(s);
		System.out.println(s1);
		
		
		//charAt() : to return the character of the string based on the index position
		System.out.println(s1.charAt(5));
	
		
		//length() : to return the length of the string
		System.out.println(s1.length());
		
		
		//concat() :  add two strings to this existing string
		System.out.println(s1.concat(s));
		System.out.println(s.concat(s1));
		System.out.println(s);
		
		
		
		//contains()  : to check whether a character is present or not in the string
		//if it is present it return true otherwise false
		System.out.println(s1.contains("g"));
		System.out.println(s1.contains("c"));
		
	
		//isEmpty()  : to check whether the string is empty or not; it returns boolean
		System.out.println(s.isEmpty());
		System.out.println(s2.isEmpty());
		
		
		//toUpperCase() : to convert small letters to capital letters
		System.out.println(s1.toUpperCase());
		
		
		//toLowerCase()  : to convert capital letters to small letters
		System.out.println(s1.toLowerCase());
		
		
		//valueOf()  : to convert any datatypes to string
		int a = 10;
		System.out.println(String.valueOf(a));
		double r =34.66d;
		System.out.println(String.valueOf(r));
		
		
		//equals() : to check two string is equal or not
		String i = "Java";
		String j = "java";
		String k = "java";
		String l = new String("java");
		String m = new String("java");
		System.out.println(j.equals(k));
		System.out.println(i.equals(k));
		System.out.println(l.equals(m));
		
		
		//equalsIgnoreCase()   :Ignore the case and check the given string is equal or not
		System.out.println(i.equalsIgnoreCase(k));
		System.out.println(j==k); // method checks the value
		System.out.println(l==m); //equal operator is used to compare the object references meaning, it checks, if two variables point to the same memmory locations.On the other hand, equals method is used to compare the value of the objects.
	
		
		//trim : it is used to remove the leading and trailing spaces
		String i1 = "    Today is Thursday  ";
		System.out.println(i1.trim());
		
		
		//subString()  :extract the part of the string
		System.out.println(i1.substring(7));
		System.out.println(i1.substring(8, 10));
		System.out.println(i.substring(1, 3));
		System.out.println(i.substring(0, 3));
		System.out.println(i.substring(1));
		
		
		
	}
	
	
	
	

}
