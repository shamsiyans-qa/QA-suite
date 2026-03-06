package encapsulation;

public class CapsuleChild1 {

	public static void main(String[] args) {
		CapsuleParent1 object = new CapsuleParent1();
		
		
		
		object.setName("Shamsiya");
		object.setAge(28);
		System.out.println(object.getName());
		System.out.println(object.getAge());

	}

}
