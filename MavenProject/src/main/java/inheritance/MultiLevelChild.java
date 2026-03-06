package inheritance;

public class MultiLevelChild extends MultiLevelIntermediate
{
	public void demo()
	{
		System.out.println("This is child class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiLevelChild object = new MultiLevelChild();
		object.data();
		object.demo();
		object.test();

	}

}
