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
			int num = -1;
			while(num != 5) {
				System.out.println("* Book Info Edit Menu *");
				System.out.println("1. Edit ID");
				System.out.println("2. Edit Title");
				System.out.println("3. Edit Writer");
				System.out.println("4. Edit Publisher");
				System.out.println("5. Exit");
				System.out.println("Select one number between 1 - 5  :)");
				num = input.nextInt();
				
				if(num == 1) {
					System.out.print("Book ID : ");
					book.id = input.nextInt();
				}
				
				else if(num == 2) {
					System.out.print("Book Title : ");
					book.title = input.next();
				}
				
				else if(num == 3) {
					System.out.print("Writer : ");
					book.writer = input.next();
				}
				
				else if(num == 4) {
					System.out.print("Publisher : ");
					book.publisher = input.next();
				}
				
				else {
					continue;
				}
				
			}
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
