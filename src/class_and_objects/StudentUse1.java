package class_and_objects;

import java.util.Scanner;

public class StudentUse1 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 Student1 s1=new Student1(); //creating an new object  of class student1
		                             // s1 is the reference to student1
		 
		  System.out.println(s1);  // it will pass the address where student1 is stored
		  s1.name="Abhay";
		  s1.setRollnumber(-121); // here we are setting the rollNo
		  
		  System.out.println(s1.name);
		  System.out.println(s1.getRollNumber()); // here we are getting the output through "getRollNumber();" function
		  
		  Student1 s2=new Student1(); // creating another object  of class student1
		  s2.name="coder";
		  s2.setRollnumber(123);
		  System.out.println(s2.name); // here we are doing the same way just we are doing before to get the name bcz the 
		                                   //"public String name ;" is declare in public member function
		  
		  System.out.println(s2.getRollNumber());
		 
		  
		}
}
