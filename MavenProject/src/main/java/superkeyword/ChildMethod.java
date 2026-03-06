package superkeyword;

public class ChildMethod extends ParentMethod
{
	
	
	
	public void display(int a)
	{
		System.out.println("Value is : " + a);
		super.data();
		super.test();
		this.post();
	}
	
	public void post()
	{
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildMethod object = new ChildMethod();
		object.display(100);

	}

}
