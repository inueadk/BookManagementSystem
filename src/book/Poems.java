package book;

import java.util.Scanner;

public class Poems extends Book{
	
	public Poems(BookKind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input)
	{
		setBookID(input);

		System.out.print("Book Title : ");
		String title = input.next();
		System.out.print("Book Title 2: ");
		String title2 = input.next();
		this.setTitle(title, title2);

		setBookWriter(input);
		setBookPublisher(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind : "+ skind + " Id : " + id + "  Title : " + title+", Sub title : "+title2+ "  Writer : " + writer + "  Publisher : " + publisher);
	}
	
}
