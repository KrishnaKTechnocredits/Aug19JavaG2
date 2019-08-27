package ShivaniG;

class Ques8
{
	void vowel(String statement)
    {
        int j = 0; //a
		int k = 0; //e
		int l = 0; //i
		int m = 0; //o
		int n = 0; //u
        for(int i = 0; i < statement.length(); ++i)
        {
            char ch = statement.charAt(i);
            if(ch == 'a')
			{
				++j;
			}
			else if(ch == 'e')
			{
				++k;
			}
			else if(ch == 'i')
			{
				++l;
			}
			else if(ch == 'o')
			{
				++m;
			}
			else if(ch == 'u')
			{
				++n;
			}
		}
		System.out.println("a: " + j);
        System.out.println("e: " + k);
        System.out.println("i: " + l);
        System.out.println("o: " + m);
		System.out.println("u: " + n);
    }
    public static void main(String[] a)
    {
        Ques8 ques8 = new Ques8();
        ques8.vowel("haleluiaao");
	}
}