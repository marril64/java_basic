package overriding;

public class Tiger extends Animal {
	
	public String race;
	
	public void howl() {
		System.out.println("호랑이가 웁니다 어흥");
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age + "살, 성별 : " + gender + ", 종 : " + race);
	}

}
