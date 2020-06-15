package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import book.Book;
import book.BookInput;
import book.BookKind;
import book.Novels;
import book.Poems;
import book.Textbook;
import book.Workbook;

public class BookManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8867333931238636841L;
	
	ArrayList<BookInput> books = new ArrayList<BookInput>();
	transient Scanner input; 	//스캐너는 저장할 것이 아님.
	BookManager(Scanner input){
		this.input = input;
	}
	
	public void setScanner(Scanner input) {	//스캐너 설정
        this.input = input;
    }
	
	public void addBook() {	//책 추가 함수
		int kind = 0;
		BookInput bookInput;
		while(kind <1 || kind > 4)
		{
			try {	//예외 체크
				System.out.println("1 is for Textbook, ");
				System.out.println("2 is for Workbook, ");
				System.out.println("3 is for Novels, ");  
				System.out.println("4 is for Poems !! ");  
				System.out.print("Select num for kind of book 1 - 4 : ");

				kind = input.nextInt();
				if(kind == 1)
				{
					bookInput = new Textbook(BookKind.Textbook);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
				}
				else if(kind == 2)
				{
					bookInput = new Workbook(BookKind.Workbook);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
				}
				else if(kind == 3)
				{
					bookInput = new Novels(BookKind.Novels);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
				}
				else if(kind == 4)
				{
					bookInput = new Poems(BookKind.Poems);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
				}
				else
				{
					System.out.print("Select num for Book Kind (1 - 4) :");
				}
			}
			catch(InputMismatchException e) {	//숫자가 아닌 문자를 입력받은 경우
				System.out.println("Please put an integer between 1 and 4!");	//에러메세지
				if(input.hasNext()) {
					input.next();	
				}
				kind = -1;
			}
		}
	}
	
	public void deleteBook() {	//책 삭제 함수
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		int index = findIndex(bookId);
		removefromBooks(index, bookId);
	}
	
	public int findIndex(int bookId)
	{
		int index = -1;
		for(int i=0; i<books.size();i++)
		{
			if(books.get(i).getId() == bookId) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromBooks(int index, int bookId)
	{
		if(index >= 0)
		{
			books.remove(index);
			System.out.println("The book "+bookId+"is deleted.");
			return 1;
		}
		else
		{
			System.out.println("The book has not been registered.");
			return -1;
		}
	}
	
	public void editBook() {	//책 정보 수정 함수
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		for(int i=0; i<books.size();i++)
		{
			BookInput book = books.get(i);
			if(book.getId() == bookId) {
				int num = -1;
				while(num != 5) {
					try {	//예외 처리 추가
						showEditMenu();
						num = input.nextInt();
						switch(num)
						{
						case 1:
							book.setBookID(input);
							break;
						case 2:
							book.setBookTitle(input);
							break;
						case 3:
							book.setBookWriter(input);
							break;
						case 4:
							book.setBookPublisher(input);
							break;
						default: 
							continue;
						}
					}
					catch(InputMismatchException e) {	//숫자가 아닌 문자를 입력받은 경우(예외 찾음)
						System.out.println("Please put an integer between 1 and 5!");	//에러메세지
						if(input.hasNext()) {
							input.next();
						}
					}
					num = -1;
				}//while
				break;
			}//if
		}//for
	}

	public void viewBooks() {	//책 조회 함수
		System.out.println("num of registered books : "+books.size());
		for(int i=0; i<books.size();i++)
		{
			books.get(i).printInfo();
		}
	}
	public int size() { 	//12주차 추가 -->사이즈 함수 bookViewer에 추가하기 위해 생성
		return books.size();
	}
	public BookInput get(int index) {	//12주차 추가 -->인덱스 리턴함수 bookViewer에서 사용하기 위해 생성
		return (Book) books.get(index);
	}
	
	public void showEditMenu()	//책 정보 수정 메뉴를 보여주는 함수
	{
		System.out.println("* Book Info Edit Menu *");
		System.out.println("1. Edit ID");
		System.out.println("2. Edit Title");
		System.out.println("3. Edit Writer");
		System.out.println("4. Edit Publisher");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5  :)");
	}

}
