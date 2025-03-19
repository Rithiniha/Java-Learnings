package task;
import java.util.*;

class Book{
	int bookId;
	String title;
	String author;
	int price;
	
	Book(int bookId,String title,String author,int price){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.price=price;
		
	}
	public void Displaydetails() {
		System.out.println("The book ID  : "+bookId);
		System.out.println("The title is : "+title);
		System.out.println("The author : "+author);
		System.out.println("The price : "+price);
	}
	
public class Library {

	public static void main(String[] args) {
		Book book = new Book(23, "Harry potter","JK rowling",250);
		Book book1 = new Book(23, "Harry potter 2 ","JK rowling",250);
		Book book2 = new Book(23, "Harry potter 3","JK rowling",250);
		book.Displaydetails();
		book2.Displaydetails();
		book1.Displaydetails();
		

	}

}
}
