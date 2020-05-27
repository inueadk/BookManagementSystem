import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;  //예외처리
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt"); //로그 기록
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System .in);
		//직렬화
		BookManager bookManager = getObject("bookmanager.ser");
		
		if(bookManager == null) {	//bookManager이 null인 경우만
			bookManager = new BookManager(input);
		}
		else {
			bookManager.setScanner(input);
		}
		
		selectMenu(input, bookManager);
		putObject(bookManager, "bookmanager.ser");
	}
	//메뉴선택함수
	public static void selectMenu(Scanner input, BookManager bookManager)	//메뉴선택함수
	{
		int num = -1;
		while(num != 5) {
			try {	//예외 체크
				showMenu(); 
				num = input.nextInt();
				switch(num) 
				{
				case 1:
					bookManager.addBook();
					logger.log("Add a book");	//로그 기록
					break;
				case 2:
					bookManager.deleteBook();
					logger.log("Delete a book");	//로그 기록
					break;
				case 3:
					bookManager.editBook();
					logger.log("Edit a book");	//로그 기록
					break;
				case 4:
					bookManager.viewBooks();
					logger.log("View a list of books");	//로그 기록
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");	//에러메세지 출력
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	//메인 메뉴를 보여주는 함수
	public static void showMenu()
	{
		System.out.println("** Book Management System Menu **");
		System.out.println("1. Add Book");
		System.out.println("2. Delete Book");
		System.out.println("3. Edit Book");
		System.out.println("4. View Books");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5  :)");
	}
	
	public static BookManager getObject(String filename) {	//직렬화(읽기)
		BookManager bookManager = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			bookManager = (BookManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return bookManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bookManager;
	}
	
	public static void putObject(BookManager bookManager,String filename) {	//직렬화(쓰기)
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(bookManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
