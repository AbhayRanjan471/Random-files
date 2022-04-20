package Question;

//public class BookUse {
//
//	public static void main(String[] args) {
//		 Book b=new Book();
//		 b.price=16; //#price is a final field, thus statement “ b.price = 16 “ is incorrect
//		              //since we cannot re assign a final variable
//		 System.out.println(b.price);
//
//	}
//
//}

//Question 2
public class BookUse{
	
public static void main(String[] args) {
    System.out.print(Book.count + " ");
    Book b1 = new Book(500);
    Book b2 = new Book(600);
    System.out.println(Book.count);
}
}
