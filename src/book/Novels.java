package book;

import java.util.Scanner;

public class Novels extends Book {
	
	public Novels(BookKind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input)
	{
		System.out.print("Book ID : ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Book Title : ");
		String title = input.next();
		this.setTitle(title);

		System.out.print("Writer : ");
		String writer = input.next();
		this.setWriter(writer);

		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' )
		{
			System.out.print("Does it have a publisher?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y')
			{
				System.out.print("Publisher : ");
				String publisher = input.next();
				this.setPublisher(publisher);
				break;
			}
			else if(answer == 'n' || answer == 'N')
			{
				this.setPublisher("");
				break;
			}
			else
			{

			}
		}
//		System.out.print("Publisher : ");
//		String publisher = input.next();
//		this.setPublisher(publisher);
	}
}
