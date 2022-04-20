package class_and_objects;

public class StudentImpKeywords {

	 String name;
	
	//two option to initialize 'final' data member
	//option 1:- final data member can be initialized as soon as they r declared
	//option 2:- in constructor
	private final int rollNo;  //after using the keyword 'final' we cannot change the value of rollNo
    
	private static int numStudents; // to check total; no. of student
	                                // we are making it private so that no one can change it will be only accessible in constructer
	                                // we will use get function to access it
	
//	public StudentImpKeywords(String n) { // this shows error bcz constructor forces us to initialized variable 'rollNo' bcz we have used final data member on it
//		name=n;
//	}
	
	public static int getNumStudent() {
		return numStudents;
	}
	 
	
	public StudentImpKeywords(String name,int rollNo) {
		
		this.name=name; // 'this' keyword is used to access data member which has same name as a local variable
		this.rollNo=rollNo;//'this' keyword works as a reference to the current Object whose Method or constructor is being invoked
		numStudents++;
	}
	
	public void print() {
		System.out.println(name+ ":" + rollNo);
	}
	
	
}
