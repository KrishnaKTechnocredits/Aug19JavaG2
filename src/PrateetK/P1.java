package PrateetK;
//Problem statement: Make a program to print pattern with *
public class P1 {

	static void displayPattern(int m){
		for (int i=1; i<=m; i++){
			for (int j=1;j<=i;j++){
				System.out.print("*");//prints number of *'s in one row.
			}
			System.out.println(); //switches the output to a new line after the inner for loop.
		}
	}	
	public static void main (String args[]){
		displayPattern(5); //User can pass the number of rows for the pattern to be printed.
	}
}
