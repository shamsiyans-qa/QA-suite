package encapsulation;

public class CapsuleChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CapsuleParent object = new CapsuleParent();
		object.setName("Shamsiya");
		object.setInteger(28);
		System.out.println(object.getInteger());
		System.out.println(object.getName());

	}

}
