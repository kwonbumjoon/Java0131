package ex05;

public class BookController {
	public static void main(String[] args) {
		details(new Novel());
		details(new Textbook());
		details(new Magazine());
	}
	
	public static void details(Book book) {
		String msg = book.getDetails();
		System.out.println(msg);
	}
}
