import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System .in);
		BookManager bookManager = new BookManager(input);
		
		int num = -1;
		while(num != 5) {
			showMenu(); 
			num = input.nextInt();
			switch(num) //if문이 switch문으로
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
	}
	
	public static void showMenu()
	{
		System.out.println("** Book Management System Menu **");
		System.out.println("1. Add Book");
		System.out.println("2. Delete Book");
		System.out.println("3. Edit Book");
		System.out.println("4. View Books");	//book이 books로 바뀜
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5  :)");
	}
	
}
