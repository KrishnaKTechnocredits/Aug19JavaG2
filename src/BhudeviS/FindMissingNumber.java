package BhudeviS;

public class FindMissingNumber {

	void FindMissingNumber()
	{
		int A[]= {1,2,3,4,5,6,7,8,9};
		int sum= A[0]+A[1]+A[2]+A[3]+A[4]+A[5]+A[6]+A[7]+A[8];
		
		int num=55;
		int MissingNumber= num-sum;
		System.out.println(MissingNumber);
	}
	
	public static void main(String[] args) {
		FindMissingNumber find= new FindMissingNumber();
		find.FindMissingNumber();
	}
}
