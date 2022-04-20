package class_and_objects;

//A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).
//Implement the Complex numbers class that contains following functions -
//1. constructor
//You need to create the appropriate constructor.
//2. plus -
//This function adds two given complex numbers and updates the first complex number.
//e.g.
//if C1 = 4 + i5 and C2 = 3 +i1
//C1.plus(C2) results in: 
//C1 = 7 + i6 and C2 = 3 + i1
//3. multiply -
//This function multiplies two given complex numbers and updates the first complex number.
//e.g.
//if C1 = 4 + i5 and C2 = 1 + i2
//C1.multiply(C2) results in: 
//C1 = -6 + i13 and C2 = 1 + i2
//4. print -
//This function prints the given complex number in the following format :
//a + ib
//Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b

public class ComplexNumberUse {

	public static void main(String[] args) {
		 
		ComplexNumber c1=new ComplexNumber(2,3);
		c1.print();
		
		c1.setReal(10);
		c1.setImaginary(30);
		c1.print();
     
		ComplexNumber c2=new ComplexNumber(1,5);
		c1.add(c2);
		//System.out.println("c1");
		c1.print();
		c2.print();
		
		ComplexNumber c3=new ComplexNumber(3,2);
		c3.multiply(c2);
		c3.print();
	    c2.print();
		
		ComplexNumber c4=ComplexNumber.add(c1,c3); // in this the value of c1 and c3 will not change they will just add up and store in c4
		c1.print();
		c3.print();
		c4.print();
		
//		ComplexNumber c5 = c1.conjugate(); // 1st way
//		c5.print();
		
		ComplexNumber c5 = ComplexNumber.conjugate(c1); // 2nd way
		c5.print();
		
		
	}
	

}
