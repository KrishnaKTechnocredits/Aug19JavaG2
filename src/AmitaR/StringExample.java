package AmitaR;

public class StringExample {

	public static void main(String[] args) {
		String str="i am a good girl";
		String[] s=str.split(" ");
		String s1=str.replace('a','h');
		
		
		System.out.println(s1);
		System.out.println(s.length);
		if(str.contains("a"))
		{
			System.out.println();
		}

	}

}
