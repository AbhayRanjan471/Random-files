package class_and_objects;
import java.util.Scanner;
public class StudentConstructeUse {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
		 StudentConstructer s1=new StudentConstructer("Abhay Ranjan" ,123 ); // it's a parameterized constructor where we pass the value at the time of constructor creation
           s1.print();
           
           StudentConstructer s2=new StudentConstructer("Shiri");
            s2.setRollnumber(-123);
           s2.print();
	}

}
