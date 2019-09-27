package AmitaR;
/*5. Create a class Book having Title, Book Publisher, Author with parameterized constructor using this
 keyword. Write a method to display the details of the Book and Test the class by creating objects.
package coreJavaAssignment3;*/

public class Book 
{
	String title;
	String author;
	String publisher;

	Book(String tl, String ar, String pr) 
	{
		title = tl;
		author = ar;
		publisher = pr;
	}

	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}

	public String getPublisher()
	{
		return publisher;
	}

	void display()
	{
		System.out.println("The title of the book is : " + title);
		System.out.println("The author of the book is :" + author);
		System.out.println("The publisher is :" + publisher);
	}

}
