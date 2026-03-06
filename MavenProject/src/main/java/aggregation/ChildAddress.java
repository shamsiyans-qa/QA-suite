package aggregation;

public class ChildAddress {
	
	String parentname;
	int age;
	ParentAddress refv;
	public ChildAddress(String parentname,int age,ParentAddress refv)
	{
		this.parentname=parentname;
		this.age=age;
		this.refv=refv;
	}
	
	public void display()
	{
		System.out.println("Parent Name is : " + parentname);
		System.out.println("Age is : " + age);
		System.out.println(refv.address);
		System.out.println(refv.locality);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentAddress object1 = new ParentAddress("Nambipunnilath","Kodungallur");
		ChildAddress object = new ChildAddress("Saleem",60,object1);
		object.display();
		

	}

}
