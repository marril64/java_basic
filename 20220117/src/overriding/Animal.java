package overriding;

public class Animal {
	// 모든 동물이 공통적으로 가지는 특성부터 정의
	public String gender;
	public String name;
	public int age;
	
	public void howl() {
		System.out.println("동물이 웁니다.");
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender);
	}

}
