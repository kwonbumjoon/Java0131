package ex05;

public class Textbook extends Book {
	public Textbook() {}
	@Override
	public String getDetails() {
		return super.getDetails() + " : 학문 분야";
	}
}
