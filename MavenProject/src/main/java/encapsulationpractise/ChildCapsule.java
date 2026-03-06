package encapsulationpractise;

public class ChildCapsule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentCapsule object = new ParentCapsule();
		object.setName("SHAMSIYA");
		System.out.println(object.getName());
		
		object.setPassword(123);
		System.out.println(object.getPassword());

	}

}
