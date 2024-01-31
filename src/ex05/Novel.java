package ex05;

public class Novel extends Book {
	public Novel() {}
	@Override
	public String getDetails() {
		return super.getDetails() + " : 장르";
	}
}
