package class_and_objects;

public class Student1 {

	public String name;
	private int rollNo;
	
	//USE of setters and getters
	public void setRollnumber(int rn) { // this function is basically used to set roll no (just like taking input)
		if(rn <=0) {                    // using this function we can access the private data members (just like in this we can acces 
			                            //    private int rollNo; from main class
			return;
		}
		rollNo=rn;
	}
	
	public int getRollNumber() {  //this function is used to get the output
		return rollNo;
	}
}
