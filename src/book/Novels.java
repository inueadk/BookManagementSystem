package book;

import java.util.Scanner;

public class Novels extends TypeOfBook{
	
	public Novels(BookKind kind){
		super(kind);
	}	
	
	public void getUserInput(Scanner input)
	{
		setBookID(input);
		setBookTitle(input);
		setBookWriter(input);
		setBookPublisherwithYN(input);

	}
}
