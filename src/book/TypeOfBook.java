package book;
import java.util.Scanner;

public abstract class TypeOfBook extends Book {
	
	public TypeOfBook(BookKind kind){
		super(kind);
	}
	
	public abstract void getUserInput(Scanner input);
	
	public void printInfo()
	{
		String skind = getKindString();
		System.out.println("Kind : "+ skind + "Id : " + id + "  Title : " + title + "  Writer : " + writer + "  Publisher : " + publisher);
	}
	
	public void setBookPublisherwithYN(Scanner input)
	{
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' )
		{
			System.out.print("Does it have a publisher?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y')
			{
				setBookPublisher(input);
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
	}

}
