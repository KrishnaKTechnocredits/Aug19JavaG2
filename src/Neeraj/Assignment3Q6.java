package Neeraj;

public class Assignment3Q6 {
	int maxLength=0;
	String maxString="";
	 void reverseMaxString(String[] line)
	{
		for(int i= line.length-1; i>=0;i--)
		{
			if(maxLength<line[i].length())
			{
				maxLength=line[i].length();
				maxString=line[i];
				
				
			}
			
			System.out.println(maxString.charAt(i));
		}
		
		
	}
	
	public static void main(String[] args) {
		String[] line= {"all the best", "technocredits", "", "maharashtra"};
		 new Assignment3Q6().reverseMaxString(line);
		
	}

}
