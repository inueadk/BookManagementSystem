
public class Book {
	int id;
	String title;
	String writer;
	String publisher;
	
	public Book(){
		
	}
	public Book(int id, String title){
		this.id = id;
		this.title = title;
	}
	public Book(int id, String title, String writer, String publisher){
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
	}
	
	public void printInfo() {
		System.out.println("Id : " + id);
		System.out.println("Title : " + title);
		System.out.println("Writer : " + writer);
		System.out.println("Publisher : " + publisher);
		
	}
	
}
