import java.util.ArrayList;
import java.util.Scanner;

import book.Book;
import book.BookKind;
import book.Novels;
import book.Poems;
import book.Workbook;

public class BookManager {
	ArrayList<Book> books = new ArrayList<Book>();
	Scanner input;
	BookManager(Scanner input){
		this.input = input;
	}
	
	public void addBook() {
		int kind = 0;
		Book book;
		while(kind != 1 && kind != 2 && kind != 3)
		{
			System.out.println("1 is for Textbook, ");
			System.out.println("2 is for Workbook, ");
			System.out.println("3 is for Novels, ");  //2,3¼ø¼­ ¹Ù²ñ
			System.out.println("4 is for Poems !! ");  //2,3¼ø¼­ ¹Ù²ñ
			System.out.print("Select num for kind of book 1 - 4 : ");

			kind = input.nextInt();
			if(kind == 1)
			{
				book = new Book(BookKind.Textbook);
				book.getUserInput(input);
				books.add(book);
				break;
			}
			else if(kind == 2)
			{
				book = new Workbook(BookKind.Workbook);
				book.getUserInput(input);
				books.add(book);
				break;
			}
			else if(kind == 3)
			{
				book = new Novels(BookKind.Novels);
				book.getUserInput(input);
				books.add(book);
				break;
			}
			else if(kind == 4)
			{
				book = new Poems(BookKind.Poems);
				book.getUserInput(input);
				books.add(book);
				break;
			}
			else
			{
				System.out.print("Select num for Book Kind (1 - 4) :");
			}
		}
	}
	
	public void deleteBook() {
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		int index = -1;
		for(int i=0; i<books.size();i++)
		{
			if(books.get(i).getId() == bookId) {
				index = i;
				break;
			}
		}
		if(index >= 0)
		{
			books.remove(index);
			System.out.println("The book "+bookId+"is deleted.");
		}
		else
		{
			System.out.println("The book has not been registered.");
			return;
		}
	}
	
	public void editBook() {
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		for(int i=0; i<books.size();i++)
		{
			Book book = books.get(i);
			if(book.getId() == bookId) {
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
						int id = input.nextInt();
						book.setId(id);
					}

					else if(num == 2) {
						System.out.print("Book Title : ");
						String title = input.next();
						book.setTitle(title);
					}

					else if(num == 3) {
						System.out.print("Writer : ");
						String writer = input.next();
						book.setWriter(writer);
					}

					else if(num == 4) {
						System.out.print("Publisher : ");
						String publisher = input.next();
						book.setPublisher(publisher);
					}

					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewBooks() {
//		System.out.print("Book ID : ");
//		int bookId = input.nextInt();
		System.out.println("num of registered books : "+books.size());//num´ë½Å swizeÇÔ¼ö·Î ¹Ù²Þ
		for(int i=0; i<books.size();i++)
		{
			books.get(i).printInfo();
		}
	}

}
