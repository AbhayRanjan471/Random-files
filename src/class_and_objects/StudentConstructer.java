package class_and_objects;

public class StudentConstructer {

	public String name;
	private int rollNo;// to acces this private data member from main class we have to use ge-set function
	
	public StudentConstructer(String n,int rn) { // this is the constructor which we have made here we are taking 2 inputs
		                                        //constructor can access the private data member of it's own class ,and constructor is public
		                                       // as well so we can access constructor through main class and indirectly through constructor
		                                      // we can access the private data member from main class.
		                                     // so here if we remove the get-set function we can access the private data member through constructor
		name=n;
		rollNo=rn;
		
	}
	public StudentConstructer(String n) {
		name=n;
	}
 
	
	public void setRollnumber(int rn) {
		if(rn<=0){
			return;
		}
		rollNo=rn;
	}
	public int getRollNumber() {
		return rollNo;
	}
	public void print() { // this constructer is used to print the output
		System.out.println(name+ ":" + rollNo);
	}
	
}
