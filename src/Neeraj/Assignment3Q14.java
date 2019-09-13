package Neeraj;

public class Assignment3Q14 {
	
		static int index =0;
		static int[] getUniqueArray()
		{
			int[] num1 = {1,2,3,4,2,5};
			int[] num2 = {5,6,7,8,9,7};
			int[] outArray = new int[num1.length+num2.length];
			//boolean zeroFlag = false;
			for(int i=0;i<num1.length;i++)
			{
				boolean flag = false;
				for(int j=0;j<index;j++)
				{
					if(num1[i] == outArray[j])
					{
						flag = true;
						break;
					}
				}
				if(flag == false)
				{
					outArray[index] = num1[i];
					index++;
					
//					if(num1[i] == 0)
//						zeroFlag = true;
				}
			}
			
			for(int i=0;i<num2.length;i++)
			{
				boolean flag = false;
				for(int j=0;j<outArray.length;j++)
				{
					if(num2[i] == outArray[j])
					{
						flag = true;
						break;
					}
				}
				if(flag == false)
				{
					outArray[index] = num2[i];
					index++;
				}
			}
			
//			for(int i=0;i<index;i++)
//			{
//				//if(outArray[i] != 0 )
//				System.out.println(outArray[i]);
//				
////				if(zeroFlag == true && outArray[i] == 0){
////					System.out.println(outArray[i]);
////					zeroFlag = false;
////				}
//			}
			
			return outArray;
			
	 	}
		public static void main(String[] args) {
			int[] x = getUniqueArray();
			
			for(int i=0;i<index;i++)
			{
				System.out.print(" "+ x[i]);
			}
		}
	}



