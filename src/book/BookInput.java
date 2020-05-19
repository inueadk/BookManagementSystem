package book;

import java.util.Scanner;
//���� ó���� ���� �߰�
import exception.TitleFormatException;	
import exception.WriterFormatException;

public interface BookInput {
	public int getId();
	
	public void setId(int id);
	
	public void setTitle(String title) throws TitleFormatException;
	
	public void setTitle(String title,String title2);
	
	public void setWriter(String writer) throws WriterFormatException;	//���� ó�� �߰�
	
	public void setPublisher(String publisher);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
	public void setBookID(Scanner input);
	
	public void setBookTitle(Scanner input);
	
	public void setBookWriter(Scanner input);
	
	public void setBookPublisher(Scanner input);

}
