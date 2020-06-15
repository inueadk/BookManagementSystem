package book;

import java.util.Scanner;

//예외 처리를 위해 추가
import exception.TitleFormatException;	
import exception.WriterFormatException;

public interface BookInput {
	public int getId();
	
	public void setId(int id);
	
	public String getTitle(); //12주차 사용 위해 추가
	
	public void setTitle(String title) throws TitleFormatException;	//예외 처리 추가
	
	public void setTitle(String title,String title2);
	
	public String getWriter();	//12주차 사용 위해 추가
	
	public void setWriter(String writer) throws WriterFormatException;	//예외 처리 추가
	
	public String getPublisher(); //12주차 사용 위해 추가
	
	public void setPublisher(String publisher);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
	public void setBookID(Scanner input);
	
	public void setBookTitle(Scanner input);
	
	public void setBookWriter(Scanner input);
	
	public void setBookPublisher(Scanner input);

}
