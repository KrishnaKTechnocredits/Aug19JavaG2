/*
 * Find count of vowels in string
 */

package Shubhangi;

public class Program_8 {
/*
 * int length()
 * char charat(int)
 */
	void printVowelCount(String input, char ch) {
		
		int cnt=0;
		
		for(int i=0; i<input.length();i++) {	
			if(input.charAt(i) == ch) {
            cnt ++;				
			}
		}
		System.out.println(ch+":"+cnt);
		
	}
	
	public static void main(String[] args) {
		
		Program_8 p = new Program_8();
		p.printVowelCount("Welcome at Technocredits", 'a');
		p.printVowelCount("Welcome at Technocredits", 'e');
		p.printVowelCount("Welcome at Technocredits", 'i');
		p.printVowelCount("Welcome at Technocredits", 'o');
		p.printVowelCount("Welcome at Technocredits", 'u');
	}

}
