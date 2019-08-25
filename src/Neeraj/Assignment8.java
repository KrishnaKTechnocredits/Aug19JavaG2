class Assignment8
{
	//static String line= "Love the way lie or lie the way you love";
	int count=0;
	//void vowelscount(String line)
	int vowelscount(String line)
	{
		for (int j=0;j<line.length() ;j++ ) 

		{
			if(line.charAt(j)=='a' || line.charAt(j)=='e' ||line.charAt(j)=='i' ||line.charAt(j)=='o'
			 ||line.charAt(j)=='u')
			{
				count++;
			}
			
		}
		return count;

	}

	public static void main(String[] args) {
		//Assignment8 assignment8= new Assignment8();
		//assignment8.vowelscount("Love the way lie or lie the way you love");
		//System.out.println("Vowels Count:" + (assignment8.count) );
		System.out.println("Number of Vowels available in:" + new Assignment8().vowelscount("Love the way lie or lie the way you love") );

	}
}