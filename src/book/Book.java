package book;

import java.util.Scanner;

import exception.TitleFormatException;

//���� ó���� ���� �߰�

import exception.WriterFormatException;	

public abstract class Book implements BookInput {
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
	public void setId(int id){	
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title)  throws TitleFormatException{
		if(!title.contains(">") || !title.contains("<")) {	//������ >��,<�� �������� ������
			throw new TitleFormatException();	//����
		}
		this.title = title;
	}
	public void setTitle(String title,String title2){	
		this.title = title;
		this.title2 = title2;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) throws WriterFormatException {	//���� ó�� �ϴ� �κ� �߰�
		if(!writer.contains(",") && !writer.equals("None")) {	//�۰� �̸��� ,�� �������� �ʰ�, None�� �ƴ� ���
			throw new WriterFormatException();	//����
		}
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public abstract void printInfo();
	

	public void setBookID(Scanner input) 
	{
		System.out.print("Book ID : ");
		int id = input.nextInt();
		this.setId(id);
	}
	public void setBookTitle(Scanner input)
	{
		String title = "";
		while(!title.contains(">") || !title.contains("<")) {
			System.out.print("Book Title : ");
			title = input.next();
			try {
				this.setTitle(title);
			} catch (TitleFormatException e) {
				System.out.println("Incorrect Title Format. Put the title that contains > and <");
			}
		}
	}

	public void setBookWriter(Scanner input)
	{
		String writer = "";
		while(!writer.contains(",")) {
			System.out.print("Writer : ");
			writer = input.next();
			try {
				this.setWriter(writer);
			} catch (WriterFormatException e) {
				System.out.println("Incorrect Writer Format. Put the writer name that contains ,");
			}
		}
	}
	public void setBookPublisher(Scanner input)
	{
		System.out.print("Publisher : ");
		String publisher = input.next();
		this.setPublisher(publisher);
	}
	
	public String getKindString()
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
