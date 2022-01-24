package polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		// 부모타입인 Person으로 자식인 Student까지 받을 수 있음.
		Person p1 = new Person("나사람", 10); // 양쪽 다 Person
		// Student 내부에 Person이 들어있기 때문.
		Person s1 = new Student("나학생", 20, 99); // 오른쪽은 Student 자료형이 다르나, Student가 자식 클래스이므로 부모클래스인 Person을 가지고 있다.
		//자식타입을 부모타입으로 받을 수 있다.
		
		// p1과 s1의 showPerson은 다르게 돌아갑니다.
		p1.showPerson(); // Person의 showPerson이 호출된다.
		System.out.println("--------------------------");
		s1.showPerson(); // Person의 showPerson이 먼저 호출되나, 오버라이드된 Student의 showPerson이 우선권을 가지고 호출된다.
		
		// s1을 이용해 신분밝히기용 메서드를 호출해보세요.
		// s1은 Person타입이므로 Person에 소속된
		// 자원들만 호출할 수 있습니다.
		// 오버라이드만 예외적으로 호출할 수 있다.
		// s1.showStudent();
		System.out.println("--------------------------");
		Student s2 = new Student("테스트", 30, 90); // 애초에 Student타입으로 생성.
		s2.showStudent();

	}

}
