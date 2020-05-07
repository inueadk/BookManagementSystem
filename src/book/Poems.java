package book;

import java.util.Scanner;

public class Poems extends Book {
	
	public Poems(BookKind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input)
	{
		System.out.print("Book ID : ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Book Title : ");
		String title = input.next();
		String title2 = input.next();
		this.setTitle(title, title2);


		System.out.print("Writer : ");
		String writer = input.next();
		this.setWriter(writer);

		System.out.print("Publisher : ");
		String publisher = input.next();
		this.setPublisher(publisher);
	}//getUser
	
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
		System.out.println("Kind : "+ skind + " Id : " + id + "  Title : " + title+", Sub title : "+title2+ "  Writer : " + writer + "  Publisher : " + publisher);
	}
}
