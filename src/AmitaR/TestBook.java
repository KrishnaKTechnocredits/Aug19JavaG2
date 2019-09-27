/*5. Create a class Book having Title, Book Publisher, Author with parameterized constructor using this
 keyword. Write a method to display the details of the Book and Test the class by creating objects.*/
 
package AmitaR;

import java.util.Scanner;

public class TestBook
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter title of the book");
		String bookTitle=sc.next();
		
		System.out.println("Enter the Author name of the book "+bookTitle);
		String authorNm=sc.next();
		
		System.out.println("Enter the publisher name");
		String pubName=sc.next();
		
		Book b=new Book(bookTitle,authorNm,pubName);
		b.getTitle();
		b.getAuthor();
		b.getPublisher();
		b.display();

	}

}
