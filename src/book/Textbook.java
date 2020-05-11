package book;

import java.util.Scanner;

public class Textbook extends Book{
	public Textbook (BookKind kind){
		super(kind);
	}
	public void getUserInput(Scanner input)
	{
		setBookID(input);
		setBookTitle(input);
		setBookWriter(input);
		setBookPublisher(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind : "+ skind + "Id : " + id + "  Title : " + title + "  Writer : " + writer + "  Publisher : " + publisher);
	}

}
