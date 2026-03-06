package outsidepackage;

import accessmodifiers.Modifier;

public class OutsideClass extends Modifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OutsideClass object = new OutsideClass();
		object.protect();
		object.publimethod();
		//object.defmethod();
		
		Modifier object1 = new Modifier();
		object1.publimethod();
		
		//object.protectmethod();
		//note : we can access protected method only by using child class object ,cannot access directly by Parent class

	}

}
