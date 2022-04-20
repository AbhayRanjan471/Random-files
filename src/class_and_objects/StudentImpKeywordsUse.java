package class_and_objects;

import java.util.Scanner;
public class StudentImpKeywordsUse {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
        
		 StudentImpKeywords s1=new StudentImpKeywords("ABHAY",123);
	      s1.print();
	       
	       StudentImpKeywords s2=new StudentImpKeywords("Shiri",-232);
	      s2.print();
	       
	      // System.out.println(StudentImpKeywords.numStudents);// num student is same for every studdents we access it through class name
	       System.out.println(StudentImpKeywords.getNumStudent());// best way to call this function
	       
	}

}
