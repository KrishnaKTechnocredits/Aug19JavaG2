<<<<<<< HEAD
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
			
=======
// You are given a string S, which comprises English alphabets, determine the count of all the vowels in S. Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the string S
package Neeraj;

class Assignment8 {
	int count = 0;

	int vowelscount(String line) {

		for (int j = 0; j < line.length(); j++)

		{
			if (line.charAt(j) == 'a' || line.charAt(j) == 'e' || line.charAt(j) == 'i' || line.charAt(j) == 'o'
					|| line.charAt(j) == 'u') {
				count++;
			}

>>>>>>> 979f5e5d23c3f87d03b2a83394c3b7f16db0cd50
		}
		return count;

	}

	public static void main(String[] args) {
<<<<<<< HEAD
		//Assignment8 assignment8= new Assignment8();
		//assignment8.vowelscount("Love the way lie or lie the way you love");
		//System.out.println("Vowels Count:" + (assignment8.count) );
		System.out.println("Number of Vowels available in:" + new Assignment8().vowelscount("Love the way lie or lie the way you love") );
=======
		System.out.println("Number of Vowels available in:"
				+ new Assignment8().vowelscount("Love the way lie or lie the way you love"));
>>>>>>> 979f5e5d23c3f87d03b2a83394c3b7f16db0cd50

	}
}