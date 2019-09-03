package BhudeviS;

public class ArrayLoop1 {

	static void display(String[] data) {

		/*
		 * for(int index=0;index<data.length;index++) {
		 * System.out.println(data[index]); } for(int
		 * index=data.length-1;index>=0;index--) {
		 * System.out.println(data[index]); }
		 */

		int i = 0;
		while (i < data.length) {

			System.out.println(data[i]);
			i++;
		}

	}
	public static void main(String[] args) 
	{
		String name[] = new String[3];
		name[0] = "Bhudevi";
		name[1] = "Pradnya";
		name[2] = "Techno";

		display(name);

	}
}
