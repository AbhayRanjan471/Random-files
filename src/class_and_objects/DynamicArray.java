 package class_and_objects;
//in this we will get to know how to change the size of the array in between the program ,as per its requirement
 
public class DynamicArray {

	private int data[]; // through this we have got a reference ,not an actual array of some particular size
    private int nextIndex;
    
    public DynamicArray() {
    	data =new int[5];//here we are making an array of particular size
    	                 // initially we are making array of any particular size ,according to as per the requirement we will increase the size of the array
    	nextIndex =0;
    	
    }
    public int size() {
    	return nextIndex; // this is just telling us number of elements user has enter in data 
    	 }
    
     public void add(int element) {
    	 
    	 if(nextIndex == data.length) { // this tell that the array is full and we have to increase the size of the array
    		 restructure();    //by calling this function we are going to change the size of the array
    	 }
    	 data[nextIndex] = element;
    	 nextIndex++;
     }
     public void set(int index ,int element) {
    	 if(index > nextIndex) {
    		 return;
    	 }
    	 if(index < nextIndex) {
    		 data[index]=element;
    	 }
    	 else {  // this condition will exicute when (index = nextIndex)
    		 add(element); // here we are calling 'add' function so that we can increase the size of the array bcz size of the array is full
    	 }
     }
     
     public int get(int index) {
    	 if(index >= nextIndex) { // when the user has entered the index value greater then nextIndex it will error out
    		 //error out
    		 return -1;
    	 }
    	 return data[index];
     }
     
     public boolean isEmpty() {
    	 if(size()==0) {
    		 return true;
    	 }
    	 else {
    		 return false;
    	 }
     }
     
     public int removeLast() {
    	 if(size() ==0) {
    		 //TODO error out
    		 return -1;
    	 }
    	 int value =data[nextIndex -1];
    	 data[nextIndex -1]=0;
    	 nextIndex --;
    	 return value;
     }
     
     private void restructure() {
    	 
    	 int temp[]=data; // we have made a reference temp which is pointing on 'data' 
         data = new int[data.length * 2]; // here we are increasing the size of the array and making new array to greater size 
         
         for(int i=0;i< temp.length ;i++) {
        	 data[i]=temp[i]; // we are coping back our elements into new array 
        }
         
     }
     
}
