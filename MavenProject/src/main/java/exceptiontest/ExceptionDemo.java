package exceptiontest;

public class ExceptionDemo {

	public static void main(String[] args) {
    try {
	int a = 100;
	float div = a/0;
	System.out.println("Division is : " + div);
	}
		catch(ArithmeticException ar) {
			System.out.println("exception handled");
		}
    
    
    finally {
    	
    	System.out.println("Main code");
    }
    System.out.println("Hello good evening");
		
	try {	
    String a[] = {"Apple","Orange"};
		System.out.println(a[2]);
	}
	
	catch(ArrayIndexOutOfBoundsException ay) {
		System.out.println("Exception handled");
	}
		
	finally {
		System.out.println("Hello");
	}
		
		/*String i = null;
		System.out.println(i.length());*/
		
		
		
	

	}

}
