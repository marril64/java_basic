package inheritance;

public class Person { // 부모 클래스(parent, super 클래스라고도 부른다.)
	// 사람이라면 공통적으로 가질 수 있는 속성들을 정의합니다.
	public String name;
	public int age;
	// private는 상속대상에서 제외된다.
	
	// getInfo() 메서드 생성해보기.
	// 이름은 name입니다. 나이는 age입니다 라고 찍게 만들어보세요.
	public void getInfo() {
		System.out.println("이름은 " + name + "입니다. 나이는 " + age + "입니다.");
	}
	
	// 생성자는 상속이 안된다.
	// 자바의 모든 클래스는 Object를 상속받고있다.

}
