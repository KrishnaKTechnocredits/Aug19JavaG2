/*14) WAP to print even number from the array
int a = {15, 24, 52, 49, 62, 10}; 
output :- {24, 52, 62, 10}*/ 

package AmitaR;

public class Assignment2Q14 {

	static void evenArray() {
		int arr[] = { 15, 24, 52, 49, 62, 10 };
		System.out.print("The even nos are :" );
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 2 == 0) 
			{
			System.out.print( arr[i] + "  ");
			}
		}
		
	}

	public static void main(String[] args) {
		evenArray();

	}

}
