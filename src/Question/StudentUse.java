package Question;

//public class StudentUse {
//	public static void main(String[] args) {
//	    Student s = new Student(12);
//	    s.print();
//	    }
//	//#Constructor is called when an object is created, here when we create a Student 
//	//object coressponding student object is created and rollNo is assigned to 12, whereas
//	//name is assigned null (as default value for String data member is null). So output is null 12
//}

//public class StudentUse {
//    public static void main(String[] args) {
//        Student s = new Student();//##There is Compilation error - “constructor Student() is undefined” because
//        //the default constructor is available only till the point we don’t create our own constructor.
//        //So Student class has only one constructor which require roll number as argument, hence we should
//        //pass integer as argument while creating any Student object.
//        
//        s.rollNo = 15;
//        s.print();
//    }
//}

public class StudentUse {
    public static void main(String[] args) {
            Student s1 = new Student(101);
            s1.print();
            Student s2 = new Student(150, "xyz");
            s2.print();
           //#While creating first Student object we have just passed single integer argument, hence 
            //constructor 1 will be called and for second Student object constructor 2 will be called. 
            //So output will be abc 101 xyz 150. 
    }
}