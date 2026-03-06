package aggregationassignment;

public class Address {
	String address;
	String locality;
	Student ref;
	
	
	public Address(String address,String locality,Student ref) {
		this.address=address;
		this.locality=locality;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println("Name of the Student is : " + (ref.name));
		System.out.println("Roll No of the Student is : " + (ref.rollNo));
		System.out.println("Address of the Student is : " + address);
		System.out.println("Locality of the Student is : " + locality);
		
	
	}


	public static void main(String[] args) {
		
		Student object1 = new Student("Anagha",15);
		Address object = new Address("Peedikaparambil House","Kodungallur",object1);
		object.display();

	}

}
