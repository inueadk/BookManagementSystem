package book;

import java.util.Scanner;

public class Workbook extends Book {
	
	public Workbook(BookKind kind){
		super(kind);
	}
	
	protected String otherkWriter;
//	protected String TextbooPublisher;
	
	public void getUserInput(Scanner input)
	{
		System.out.print("Book ID : ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Book Title : ");
		String title = input.next();
		this.setTitle(title);
		
		System.out.print("Publisher : ");
		this.setPublisher("같은 제목을 가진 Textbook의 출판사와 동일합니다.");

		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' )
		{
			System.out.print("Does it have a writer?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y')
			{
				System.out.print("Writer : ");
				String writer = input.next();
				this.setWriter(writer);
				break;
			}
			else if(answer == 'n' || answer == 'N')
			{
				this.setWriter("따로 저자가 없습니다. 같은 제목을 가진 Textbook의 저자와 동일합니다.");
				break;
			}
			else
			{

			}
		}
		answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' )
		{
			System.out.print("Does it have other writer?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y')
			{
				System.out.print("Other Writer : ");
				String writer = input.next();
				this.setWriter(writer);
				break;
			}
			else if(answer == 'n' || answer == 'N')
			{
				this.setWriter("다른 저자가 없습니다. 같은 제목을 가진 Textbook의 저자와 동일합니다.");
				break;
			}
			else
			{

			}
		}
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
		System.out.println("Kind : "+ skind + " Id : " + id + "  Title : " + title + "  Writer : " + writer +" Other Writer : "+writer +" Publisher : " + publisher);
	}


}
