package book;

import java.util.Scanner;

//���� ó���� ���� �߰�
import exception.TitleFormatException;	
import exception.WriterFormatException;

public interface BookInput {
	public int getId();
	
	public void setId(int id);
	
	public String getTitle(); //12���� ��� ���� �߰�
	
	public void setTitle(String title) throws TitleFormatException;	//���� ó�� �߰�
	
	public void setTitle(String title,String title2);
	
	public String getWriter();	//12���� ��� ���� �߰�
	
	public void setWriter(String writer) throws WriterFormatException;	//���� ó�� �߰�
	
	public String getPublisher(); //12���� ��� ���� �߰�
	
	public void setPublisher(String publisher);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
	public void setBookID(Scanner input);
	
	public void setBookTitle(Scanner input);
	
	public void setBookWriter(Scanner input);
	
	public void setBookPublisher(Scanner input);

}
