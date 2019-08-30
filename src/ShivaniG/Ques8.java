package ShivaniG;
//WAP to count all vowels in String
class Ques8 {
	void vowel(String statement) {
		int j = 0; // count for a
		int k = 0; // count for e
		int l = 0; // count for i
		int m = 0; // count for o
		int n = 0; // count for u
		for (int i = 0; i < statement.length(); ++i) {
			char ch = statement.charAt(i);
			if (ch == 'a') {
				++j;
			} else if (ch == 'e') {
				++k;
			} else if (ch == 'i') {
				++l;
			} else if (ch == 'o') {
				++m;
			} else if (ch == 'u') {
				++n;
			}
		}
		System.out.println("count for a: " + j);
		System.out.println("count for e: " + k);
		System.out.println("count for i: " + l);
		System.out.println("count for o: " + m);
		System.out.println("count for u: " + n);
	}

	public static void main(String[] a) {
		Ques8 ques8 = new Ques8();
		ques8.vowel("haleluiaao");
	}
}