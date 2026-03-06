package stringprograms;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuffer sb = new StringBuffer("This is my String Buffer Program");
		StringBuilder b = new StringBuilder("Hi everyone");
		System.out.println(sb);
		System.out.println(b);
		
	
		
		//insert() : to insert a new word or character to the current string based on the index position
        System.out.println(sb.insert(4, " Program"));
		System.out.println(sb);
	
		
		
		//append() : to add a new string at the end of the current string
		System.out.println(b.append(" hello"));
		System.out.println(sb.append('m'));
		
		
		//replace() : to replace the character or word based on the starting and ending position 
		System.out.println(sb.replace(0, 4, "That"));
		System.out.println(sb.replace(5, 10, "are"));
		
		
		//delete() : to delete the characters based on the starting and ending position
		System.out.println(b.delete(0, 2));
		
		
		//reverse() : to reverse the string 
		System.out.println(b.reverse());

		
		
		
		
		
		
		
		
		
		
	}

}
