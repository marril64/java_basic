package abstract1;

public class Main01P304 {

	public static void main(String[] args) {
		// new 키워드로는 추상클래스를 생성할 수 없습니다.
		// Parent p1 = new Parent(); // 메서드 하나가 불완전해서 생성이 불가능하다.
		
		// 단, Parent를 상속받아 getAge메서드로 구체화시킨
		// Child타입으로는 객체 생성 및 사용이 가능합니다.
		Parent c = new Child(); // 다형성 적용
		c.getAge(); // 오버라이딩 메서드
		
		// 따로 오버라이딩을 하지 않았어도 부모쪽 일반 메서드는
		// 역시 호출 가능하다.
		c.getInfo();

	}

}
