package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 말을 하나 생성해주시고
		// 오버라이드된 메서드들을 하나씩 호출해보세요.
		Horse h1 = new Horse();
		h1.name = "서러브레드";
		h1.age = 5;
		h1.gender = "수컷";
		h1.rank = 3;
		
		h1.howl();
		h1.getInfo();

	}

}
