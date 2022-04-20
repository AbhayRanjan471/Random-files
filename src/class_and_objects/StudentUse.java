package class_and_objects;

import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 Student s1=new Student(); //creating a new object  of class student
	                           //here s1 is the reference to student
	 
	  System.out.println(s1);  // it will pass the addres where student is stored
	  s1.name="Abhay";
	  s1.rollNo=213;
	  
	  System.out.println(s1.name);
	  System.out.println(s1.rollNo);
	  
	  Student s2=new Student(); // creating another object of student class
	  s2.name="coder";
	  s2.rollNo=123;
	  System.out.println(s2.name);
	  System.out.println(s2.rollNo);
	  
	  
	}

}
