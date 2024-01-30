package ex02_2;

public class Phone {
	// 필드 선언
	private String model;
	private String color;
	
	// 메소드 선언
	public Phone() {
		System.out.println("Phone");
	}

	public Phone(String model, String color) {
		System.out.println("Phone(String model, String color)");
		this.model = model;
		this.color = color;
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	@Override
	public String toString() {
		return "Phone [model=" + model + ", color=" + color + "]";
	}

	public void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
