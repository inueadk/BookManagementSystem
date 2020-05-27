import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;  //����ó��
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt"); //�α� ���
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System .in);
		//����ȭ
		BookManager bookManager = getObject("bookmanager.ser");
		
		if(bookManager == null) {	//bookManager�� null�� ��츸
			bookManager = new BookManager(input);
		}
		else {
			bookManager.setScanner(input);
		}
		
		selectMenu(input, bookManager);
		putObject(bookManager, "bookmanager.ser");
	}
	//�޴������Լ�
	public static void selectMenu(Scanner input, BookManager bookManager)	//�޴������Լ�
	{
		int num = -1;
		while(num != 5) {
			try {	//���� üũ
				showMenu(); 
				num = input.nextInt();
				switch(num) 
				{
				case 1:
					bookManager.addBook();
					logger.log("Add a book");	//�α� ���
					break;
				case 2:
					bookManager.deleteBook();
					logger.log("Delete a book");	//�α� ���
					break;
				case 3:
					bookManager.editBook();
					logger.log("Edit a book");	//�α� ���
					break;
				case 4:
					bookManager.viewBooks();
					logger.log("View a list of books");	//�α� ���
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");	//�����޼��� ���
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	//���� �޴��� �����ִ� �Լ�
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
	
	public static BookManager getObject(String filename) {	//����ȭ(�б�)
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
	
	public static void putObject(BookManager bookManager,String filename) {	//����ȭ(����)
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
