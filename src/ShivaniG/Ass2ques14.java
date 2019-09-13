package ShivaniG;

//WAP to print even number from the array
public class Ass2ques14 {
	void even(int input[], int n) {
		System.out.print("Even numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(input[i] % 2 == 0) //checking even
            {
                System.out.print(input[i]+" ");
            }
        }
	}

	public static void main(String[] args) {
		Ass2ques14 check = new Ass2ques14();
		int input[] = { 15, 24, 52, 49, 62, 10};
		check.even(input, input.length);
	}
}
