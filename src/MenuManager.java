import java.util.InputMismatchException;  //예외처리
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System .in);
		BookManager bookManager = new BookManager(input);
		selectMenu(input, bookManager);
	}
	
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
					break;
				case 2:
					bookManager.deleteBook();
					break;
				case 3:
					bookManager.editBook();
					break;
				case 4:
					bookManager.viewBooks();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {	//숫자 말고 문자 입력
				System.out.println("Please put an integer between 1 and 5!");	//에러메세지 출력
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
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
	
}
