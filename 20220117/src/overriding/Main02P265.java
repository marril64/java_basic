package overriding;

public class Main02P265 {

	public static void main(String[] args) {
		
		Tiger t1 = new Tiger();
		t1.name = "어흥이";
		t1.age = 8;
		t1.gender = "수컷";
		t1.race = "시베리아 호랑이";
		
		t1.howl();
		t1.getInfo();

	}

}
