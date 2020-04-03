import java.util.Scanner;

public class BookManager {
	Book book;
	Scanner input;
	BookManager(Scanner input){
		this.input = input;
	}
	
	public void addBook() {
		book = new Book();
		System.out.print("Book ID : ");
		book.id = input.nextInt();
		System.out.print("Book Title : ");
		book.title = input.next();
		System.out.print("Writer : ");
		book.writer = input.next();
		System.out.print("Publisher : ");
		book.publisher = input.next();
	}
	
	public void deleteBook() {
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		if(book==null) {
			System.out.println("The book has not been registered.");
			return;
		}
		if(book.id == bookId) {
			book = null;
			System.out.println("The book is deleted.");
		}
	}
	
	public void editBook() {
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		if(book.id == bookId) {
			System.out.println("The book ID is edited -> "+ bookId);
		}
	}
	
	public void viewBook() {
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		if(book.id == bookId) {
			book.printInfo();
		}
	}

}
