package class_and_objects;

public class Polynomial {
	//public class Polynomial {
		  private int data[];	
		    public Polynomial ()
		    {
		        data = new int[5];
		    }
			
			/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
			 *  then corresponding term(with specified degree and value is added into the polynomial. If the degree
			 *  is already present in the polynomial then previous coefficient is replaced by
			 *  new coefficient value passed as function argument
			*/
			public void setCoefficient(int degree, int coeff){
		         while(degree >= data.length)
		        {
		            data = doubleCapacity(data);
		        }
		        data[degree]=coeff; // if the degree is 10 then the coffecient will be store at index 10
				                    // the value of the degree will be be its index point
			}
		    
		    private int[] doubleCapacity( int[] data)
		    {
		        int temp[]= data; // we have made a reference temp which is pointing on 'data'
		        data = new int [2*temp.length];// increasing the size of the data variable
		        for(int i=0;i<temp.length;i++)
		        {
		            data[i]=temp[i]; // putting the previous values of data which we have stored in temp
		        }
		        return data ;
		    } 
			
			// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
			public void print(){
		        if(data[0]!=0) // this one is taken for starting elements bcz (x^0 =0)
		        System.out.print(data[0]+" + ");
		     for(int i=1;i<data.length;i++)
		     {	if (data[i]!=0)
		         System.out.print(data[i]+"x"+"^"+i+" + ");
		     }
		     System.out.println();
			}

			
			// Adds two polynomials and returns a new polynomial which has result
			public Polynomial subtract(Polynomial p){
		         if (data.length > p.data.length)
		        {
		           for(int i=0; i< p.data.length; i++)
		            {
		                data[i] = data[i] - p.data[i];
		            }
		            p.data = data;
		        }else{
		            for(int i=0; i< data.length; i++ )
		            {	
		                p.data[i] = data[i] - p.data[i];
		            }
		        }
		        return p;		
			}
			
			// Subtracts two polynomials and returns a new polynomial which has result
			public Polynomial add(Polynomial p)
		    {
					if (data.length > p.data.length)
		             {
		                 for(int i=0; i< p.data.length; i++ )
		                 {
		                     data[i] = data[i] + p.data[i];
		                 }
		                 p.data = data;
		           }else
		            {
		               for(int i=0; i< data.length; i++)
		               {	
		                    p.data[i] = data[i] + p.data[i];
		                 }
		           }
		            return p;
		         }
			
			
			// Multiply two polynomials and returns a new polynomial which has result
			public Polynomial multiply(Polynomial p)
		    {
		        int[] multipy_arr = new int[5];
		    	
		     	for(int i=0; i<data.length; i++) 
		        {
		    		
		     		for(int j=0; j<p.data.length; j++)
		            {
		     		   	int product =1;
		     			product = data[i] * p.data[j];
		     			while((i+j)>=multipy_arr.length) 
		                 {
		     				multipy_arr = doubleCapacity(multipy_arr);
		     			}
		                
		     			multipy_arr[i+j] = product+multipy_arr[i+j]; // here we are doing [i+j] bcz (if i=2 nd j=3 then i+j=5 ie,
		     			                                              //( X^2 + X^3 =X^5)
		    		
		     		}
		     	}
		        p.data = multipy_arr; //storing all the data to p.data
		     	return p;
		    }     
		        
				
			}
	
	
	// wrong approach
//	private int nextIndex;
//	private int deg[];
//	private int coeff[];
//	
//	//DynamicArray Coefficient;
//	
//	public Polynomial() {
//		 coeff=new int [5];
//		 deg=new int[5];
//		nextIndex=0;
//	}
//	public void setCoefficient(int deg ,int coeff) {
//		this.deg[nextIndex]=deg;
//		this.coeff[nextIndex]=coeff;
//		nextIndex++;
//	
//	}
//	
//	//public int getCoefficient() {
//		
//	//}
//	
// public void add(Polynomial p2) {
//    	// int largest=Math.max(this.coeff ,p2.coeff);
//	 int maxcoeff=Math.max(coeff.length,p2.coeff.length);
//	 int mincoeff=Math.min(coeff.length,p2.coeff.length);
//	 
//	 for(int i=0;i<maxcoeff ;i++) {
//		 for(int j=0 ;j<maxcoeff ;j++) {
//	 
//		 if(nextIndex == coeff.length) {
//		 restructure();
//	 }
//		 else if(deg[i] == p2.deg[j]) {
//			 this.coeff[i] += p2.coeff[j];
//		 }
//		// }
//		 else  {
//			// System.out.print(coeff[i] + "x^" + deg[i] +" + " );
//		this.coeff[i]+=0;
//		 }
//	 }
//		// nextIndex=this.coeff.length;
// }
// }
// 
//     public void multiply(Polynomial p1) {
//    	 int length=Math.max(coeff.length,p1.coeff.length);
//    	 int k=0;
//    	 for(int i=0 ;i<length ;i++) {
//    		 for(int j=0 ;j<length ;j++) {
//    			 this.coeff[k]=coeff[i] * p1.coeff[j];
//    			 this.deg[k]=deg[i] + p1.deg[j];
//    			 k++;
//    		 }
//    	 }
//    	 
// }
// 
//	public void print() {
//		for(int i=0 ;i<nextIndex ;i++) {
//			if(coeff[i]==0) {
//				continue;
//			}
//		System.out.print(coeff[i] + "x^" + deg[i] +" + " );
//		}
//	    System.out.println();
//	}
//	
//	private void restructure(){
//		int temp1[]=coeff;
//		int temp2[]=deg;
//		
//		coeff =new int[coeff.length * 2];
//		deg =new int[deg.length * 2];
//		for(int i=0 ;i<temp1.length ;i++) {
//			coeff[i]=temp1[i];
//			deg[i]=temp2[i];
//		}
//	}


