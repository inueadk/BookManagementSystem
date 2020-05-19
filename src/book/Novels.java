package book;

import java.util.Scanner;

public class Novels extends TypeOfBook{
	
	public Novels(BookKind kind){
		super(kind);
	}
//getUserInput안에 있던 것	
	
	public void getUserInput(Scanner input)
	{
		setBookID(input);
		setBookTitle(input);
		setBookWriter(input);
		setBookPublisherwithYN(input);

	}
}
