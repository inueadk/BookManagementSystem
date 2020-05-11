package book;

import java.util.Scanner;

public class Workbook extends TypeOfBook implements BookInput{
	
	public Workbook(BookKind kind){
		super(kind);
	}
	
	protected String otherkWriter;
//	protected String TextbooPublisher;
	
	public void getUserInput(Scanner input)
	{
		setBookID(input);
		setBookTitle(input);
		System.out.println("Publisher : ");
		this.setPublisher("같은 제목을 가진 Textbook의 출판사와 동일합니다.");

		setBookWriterwithYN(input);
		setOtherBookWriterwithYN(input);
	}
	
	public void setOtherBookWriterwithYN(Scanner input)
	{
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' )
		{
			System.out.print("Does it have other writer?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y')
			{
				System.out.print(">> Other Writer <<");
				setBookWriter(input);
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
		String skind = getKindString();
		System.out.println("Kind : "+ skind + " Id : " + id + "  Title : " + title + "  Writer : " + writer +" Other Writer : "+writer +" Publisher : " + publisher);
	}


}
