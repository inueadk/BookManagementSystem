package book;

import java.util.Scanner;

public class Workbook extends Book implements BookInput{
	
	public Workbook(BookKind kind){
		super(kind);
	}
	
	protected String otherkWriter;
//	protected String TextbooPublisher;
	
	public void getUserInput(Scanner input)
	{
		setBookID(input);
		setBookTitle(input);
		System.out.print("Publisher : ");
		this.setPublisher("���� ������ ���� Textbook�� ���ǻ�� �����մϴ�.");

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
				this.setWriter("���� ���ڰ� �����ϴ�. ���� ������ ���� Textbook�� ���ڿ� �����մϴ�.");
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
				System.out.print(">> Other Writer <<");
				setBookWriter(input);
				break;
			}
			else if(answer == 'n' || answer == 'N')
			{
				this.setWriter("�ٸ� ���ڰ� �����ϴ�. ���� ������ ���� Textbook�� ���ڿ� �����մϴ�.");
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
