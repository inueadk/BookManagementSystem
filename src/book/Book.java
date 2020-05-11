package book;

import java.util.Scanner;

public abstract class Book implements BookInput {	//부모클래스에서 implements했으니 자식 클래스들은 할 필요 없음.
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
	
	public abstract void printInfo();
	
	//BookManager과 child클래스들에 있던 함수	
	public void setBookID(Scanner input)  //this가지고 전부 처리가능. 따라서ㅠBookInput book은 다 지움
	{
		System.out.print("Book ID : ");
		int id = input.nextInt();
		this.setId(id);
	}
	public void setBookTitle(Scanner input)
	{
		System.out.print("Book Title : ");
		String title = input.next();
		this.setTitle(title);
	}

	public void setBookWriter(Scanner input)
	{
		System.out.print("Writer : ");
		String writer = input.next();
		this.setWriter(writer);
	}
	public void setBookPublisher(Scanner input)
	{
		System.out.print("Publisher : ");
		String publisher = input.next();
		this.setPublisher(publisher);
	}
	
	public String getKindString()	//printInfo안에 있던 것
	{
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
		return skind;
	}
	
	
}
