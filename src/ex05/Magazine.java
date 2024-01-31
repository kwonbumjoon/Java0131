package ex05;

public class Magazine extends Book {
	public Magazine() {}
	@Override
	public String getDetails() {
		return super.getDetails() + " : 발행 주기";
	}
}
