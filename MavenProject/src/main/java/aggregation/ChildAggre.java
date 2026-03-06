package aggregation;

public class ChildAggre {
	String subject;
	int admissionnum;
	ParentAggre ref;
	
	public ChildAggre(String subject, int admissionnum,ParentAggre ref)//should define as parentclass name reference variable in the constructor along with the instance variables
	{
		
		this.subject = subject;
		this.admissionnum=admissionnum;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println("Subject is : " + subject);
		System.out.println("Admission number is : " + admissionnum);
		System.out.println(ref.name);
		System.out.println(ref.marks);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentAggre object1 = new ParentAggre("Shamsiya",100);
		ChildAggre object = new ChildAggre("Maths",90,object1);
		object.display();
		
		
		

	}

}
