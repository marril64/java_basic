package overriding;

// Animal을 상속받게 해주세요.
public class Horse extends Animal {
	public int rank;
	
	// 오버라이딩 요건
	// 이름과 같은 리턴자료형 등이
	// 같은 부모족 메서드를
	// 자식쪽에 다시 중복해서 작성함
	public void howl() {
		System.out.println("말이 웁니다 이히히힝");
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age + "살, 성별 : " + gender + ", 순위 : " + rank + "위");
	}

}
