
public class Book {
	int id;
	String title;
	String writer;
	String publisher;
	static int numBooksRegistered = 0;
	
	public Book(){
		numBooksRegistered++;
		
	}
	public Book(int id, String title){
		this.id = id;
		this.title = title;
		numBooksRegistered++;
	}
	public Book(int id, String title, String writer, String publisher){
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		numBooksRegistered++;
	}
	
	public void printInfo() {
		System.out.println("Id : " + id + "  Title : " + title + "  Writer : " + writer + "  Publisher : " + publisher);
//		System.out.println("Title : " + title);
//		System.out.println("Writer : " + writer);
//		System.out.println("Publisher : " + publisher);
		
	}
	
}
