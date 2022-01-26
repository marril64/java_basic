package abstract1;

// Patent 상속을 시켜보세요.
public class Child extends Parent {
	
	// getAge를 오버라이딩해주세요.
	// "부모쪽 나이는 private이라 조회가 안됩니다" 라고 출력해주세요.
	/*public Child() { // 무조건 붙이는게 아니다. 명심하자.
		super();
	}*/

	@Override // Child에 빨간 줄이 쳐져있을 때 클릭해서 만든다.
	public void getAge() {
		System.out.println("부모쪽 나이는 private이라 조회가 안됩니다.");
	}
	
	/*public void getAge() {
		System.out.println("부모쪽 나이는 private이라 조회가 안됩니다.");
	}*/

}
