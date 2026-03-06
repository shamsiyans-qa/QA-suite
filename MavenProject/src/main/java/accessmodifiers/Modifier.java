package accessmodifiers;

public class Modifier {
	
	public void publimethod()
	{
		System.out.println("This is PUBLIC METHOD");
	}
	
	private void privmethod()
	{
		System.out.println("This is PRIVATE METHOD");
	
	}
	
	protected void protect()
	{
		System.out.println("This is PROTECTED METHOD");
	
	}
	
	void defmethod()
	{
		System.out.println("This is DEFAULT METHOD");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Modifier object = new Modifier();
		object.defmethod();
		object.privmethod();
		object.publimethod();
		object.protect();

	}

}
