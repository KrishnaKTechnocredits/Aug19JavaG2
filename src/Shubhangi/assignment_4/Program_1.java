/*
 * WAP to know how many times constructor call print count of constructor calling. 
 */

package Shubhangi.assignment_4;

public class Program_1 {
	
	static int noOfObjects = 0; 
	
	public Program_1() 
    { 
        noOfObjects += 1; 
    } 
  
	
	public static void main(String[] args) {

		Program_1 t1 = new Program_1(); 
		Program_1 t2 = new Program_1(); 
		Program_1 t3 = new Program_1(); 
	  
	       System.out.println("Number of objects created are : "+ t3.noOfObjects); 
	    
	}

}
