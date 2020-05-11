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
	
	public void setBookWriterwithYN(Scanner input)
	{
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' )
		{
			System.out.print("Does it have a writer?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y')
			{
				setBookWriter(input);
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
	}

}
