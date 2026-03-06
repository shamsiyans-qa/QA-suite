package accessmodifiers;

public class OutsideClass extends Modifier {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OutsideClass object = new OutsideClass();
		object.defmethod();
		object.protect();
		object.publimethod();
	//	object.privmethod(); - it is not visible from the outside class

	}

}
