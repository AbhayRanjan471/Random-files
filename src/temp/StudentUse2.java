package temp;

import class_and_objects.Student; // this is the way to import the package of previous Student class

public class StudentUse2 {

	public static void main(String[] args) {
		 Student s=new Student(); // if we want to access previous class Student we have to IMPOT it's package
		 
       // s.rollNo=10;  // it's a default if we want to access the roolNo of class Student we have to make int rollNo as public
		 // in Student class we have to write its as "public int rollNo;  same way if want to access the name
		 
		 s.name="Abhi";  // here we can modify the name bcz in Student class we have made it public ie, "public String name;"
		 System.out.println(s.name);
		 
	}

}
