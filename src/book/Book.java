package book;

import java.util.Scanner;

public class Book {
	protected BookKind kind = BookKind.Textbook;

	protected int id;
	protected String title;
	protected String title2;
	protected String writer;
	protected String publisher;

	
	public Book(){
		
	}
	public Book(BookKind kind){
		this.kind = kind;
		
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
	public Book(BookKind kind, int id, String title, String writer, String publisher){
		this.kind = kind;
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
	public void setTitle(String title,String title2) {		//메소드 오버로딩
		this.title = title;
		this.title2 = title2;
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
		String skind = "none";
		switch(this.kind)
		{
		case Textbook:
			skind = "Textbook";
			break;
		case Novels:
			skind = "Novels";
			break;
		case Workbook:skind = "Workbook";
			break;
		case Poems:
			skind = "Poems";
			break;
		default:
		}
		System.out.println("Kind : "+ skind + "Id : " + id + "  Title : " + title + "  Writer : " + writer + "  Publisher : " + publisher);
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
