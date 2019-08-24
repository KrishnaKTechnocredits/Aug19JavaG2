package Neeraj;

public class Assignment2 
{
     
    int arraySum(int[] array)
      {
        int arrayTotal = 0; 

        for (int i = 0; i < array.length; i++)
          {
           arrayTotal= arrayTotal+array[i]; 
          }
       return arrayTotal;
      }
    

    public static void main(String[] args)
      {
      int array[] = {10,9,2,8,5};  
      System.out.println(new Assignment2().arraySum(array)); 
      //System.out.println(new Assignment2().arraySum(int[]{1,2,3,4,5})); 
      }

}