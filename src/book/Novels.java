package book;

import java.util.Scanner;

public class Novels extends TypeOfBook{
	
	public Novels(BookKind kind){
		super(kind);
	}
//getUserInput�ȿ� �ִ� ��	
	
	public void getUserInput(Scanner input)
	{
		setBookID(input);
		setBookTitle(input);
		setBookWriter(input);
		setBookPublisherwithYN(input);

	}
	
	/*
	public String getKindString()	//printInfo�ȿ� �ִ� ��
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
