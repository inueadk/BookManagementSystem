package book;
import java.util.Scanner;

import exception.WriterFormatException;	//예외 처리 하기 위해 추가

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
			try {	//예외 처리 부분 추가
				if(answer == 'y' || answer == 'Y')
				{
					System.out.print("Writer : ");
					String writer = input.next();
					this.setWriter(writer);
					break;
				}
				else if(answer == 'n' || answer == 'N')
				{
					this.setWriter("None");
					break;
				}
				else
				{

				}
			}
			catch(WriterFormatException e) {	//,가 포함되지 않았고 None도 아닌 경우
				System.out.println("Incorrect Writer Format. Put the writer name that contains ,");
			}
		}
	}

}
