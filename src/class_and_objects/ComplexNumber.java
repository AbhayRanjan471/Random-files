package class_and_objects;

public class ComplexNumber {
     
	private int realNo;
	private int imaginaryNo;
	
	public ComplexNumber(int realNo,int imaginaryNo){
		this.realNo=realNo;
		this.imaginaryNo=imaginaryNo;
	}
	public void setReal(int r) {
		this.realNo=r;
	}
	public void setImaginary(int i) {
		this.imaginaryNo=i;
	}
	public int getReal() {
		return realNo;
	}
	public int getImaginary() {
		return imaginaryNo;
	}
	
	public void print() {
		if(imaginaryNo>0) {
		System.out.println(realNo+" "+"+"+" "+imaginaryNo+"i");
	}
		else {
			System.out.println(realNo+" "+" "+imaginaryNo+"i");
			}
		}
	
	public void add(ComplexNumber c2) { // this function is used to add the complex no
		this.realNo=this.realNo + c2.realNo;
		this.imaginaryNo=this.imaginaryNo + c2.imaginaryNo;
	}
	
	public void multiply(ComplexNumber c3) {
		int realNo1=realNo * c3.realNo - this.imaginaryNo * c3.imaginaryNo;
		this.imaginaryNo=imaginaryNo * c3.realNo + c3.imaginaryNo * realNo;//this.realNo * c3.imaginaryNo;
		this.realNo=realNo1;
	}
	
	public static ComplexNumber add(ComplexNumber c1,ComplexNumber c3) {
		int real=c1.realNo + c3.realNo;
		int imaginary=c1.imaginaryNo + c3.imaginaryNo;
		
		ComplexNumber num= new ComplexNumber(real ,imaginary); // here again we have to make new object and return the value
		return num;
	}
//		public  ComplexNumber conjugate() {        // 1st way to do this 
//			int imaginary1=-1*(this.imaginaryNo);
//			ComplexNumber num =new ComplexNumber(this.realNo ,imaginary1);
//			return num;
//		}
	public static ComplexNumber conjugate(ComplexNumber c1) {  // 2nd way
		int imaginary1=-1*(c1.imaginaryNo);
		ComplexNumber num =new ComplexNumber(c1.realNo ,imaginary1);
		return num;
	}
	}

