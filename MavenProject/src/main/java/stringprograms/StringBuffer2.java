package stringprograms;

public class StringBuffer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer a = new StringBuffer("Hello World");
		System.out.println(a.insert(5, 'H'));
		
		
		//append() 
		System.out.println(a.append("everyone"));
		
		//replace() : 
		System.out.println(a.replace(0, 3, "k"));
		
		//delete : 
		System.out.println(a.delete(0, 2));
		System.out.println(a.delete(3, 8));
		System.out.println(a.delete(5, 9));

		
		//reverse : 
		
		System.out.println(a.reverse());
	}

}
