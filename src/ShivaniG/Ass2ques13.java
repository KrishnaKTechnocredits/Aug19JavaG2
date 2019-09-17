package ShivaniG;

//WAP to reveres array
public class Ass2ques13 {
	static void reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { //reversing the array
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < n; k++) { 
            System.out.println(b[k]); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int [] arr = {5, 6, 9, 10, 14, 63}; 
        reverse(arr, arr.length); 
    } 
}
