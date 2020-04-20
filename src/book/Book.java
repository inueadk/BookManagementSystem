package book;

import java.util.Scanner;

public class Book {
	protected BookKind kind = BookKind.Textbook;

	protected int id;
	protected String title;
	protected String writer;
	protected String publisher;

	
	public Book(){
		
	}
	public Book(int id, String title){
		this.id = id;
		this.title = title;
	}
	public Book(int id, String title, String writer, String publisher){
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
	}
	
	public BookKind getKind() {
		return kind;
	}
	public void setKind(BookKind kind) {
		this.kind = kind;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void printInfo() {
		System.out.println("Id : " + id + "  Title : " + title + "  Writer : " + writer + "  Publisher : " + publisher);
	}
	
	public void getUserInput(Scanner input)
	{
		System.out.print("Book ID : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Book Title : ");
		String title = input.next();
		this.setTitle(title);
		
		System.out.print("Writer : ");
		String writer = input.next();
		this.setWriter(writer);
		
		System.out.print("Publisher : ");
		String publisher = input.next();
		this.setPublisher(publisher);
	}
	
	
}
