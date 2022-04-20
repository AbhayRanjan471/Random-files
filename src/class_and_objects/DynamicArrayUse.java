package class_and_objects;

public class DynamicArrayUse {

	public static void main(String[] args) {
		 
		 DynamicArray d=new  DynamicArray();
		 
		 for(int i=0;i<100 ;i++) {
			 d.add(i + 10); // here we are putting elements in the array
		 }
		 System.out.println(d.size()); // dynamic array will print its size ie,how many elements dynamic array has taken
		 
		 d.set(4 , 10); //its means we are initializing 10 at postion 4 ie, arr[4]=10;
		                // we will use it when we want to change the value at any particular position
		 
		 System.out.println(d.get(3)); // through get function we will get to know what is the value at position 3
	     System.out.println(d.get(4)); // get me the value at position 4
	     
	     while( !d.isEmpty()) {// this function is generally use to check is the array is empty
	    	 
	    	 System.out.println(d.removeLast()); //this function is used to remove the last elements
	    	 
	    	 System.out.println("size = " + d.size());
	     }
	     
	}
	
	//total no of function used are
	/* 
	 1.Constructor
	 2.ass(add to ends
	 3.size
	 4.set
	 5.get
	 6.remove last
	 7.is empty
	  */

}
