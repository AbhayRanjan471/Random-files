package class_and_objects;

public class ShapeUse {

	 public static void main(String[] args) {
		 Shape s=new Shape();
		 s.height=1;     
		 System.out.println(s.height);  //##Since height is a default data member of class Shape and
		 //ShapeUse both the classes are in same package. So we can access height via shape object in ShapeUse class.
	 }
}

//public class ShapeUSe{
//	public ststic void main(String[] args) {
//		Shape s=new Shape();
//		System.out.println(s.height);  //#As height is a private data member of class Shape, thus
                                        //it can’t be accessed outside the class.
//	}
//}