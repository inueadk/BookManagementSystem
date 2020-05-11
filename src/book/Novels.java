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
	
	/*
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
	}*/
}
