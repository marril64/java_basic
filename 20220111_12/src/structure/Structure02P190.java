package structure;

public class Structure02P190 {
	
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person p) { // Person 타입을 받음 (정확히는 주소값을 받음)
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 연락처 : " + p.pNum + ", 번호 : " + p.uNum);
	}

	public static void main(String[] args) {
		// 사람을 두명 만들어보세요(a, b)
		Person a = new Person(); // 힙에 주소를 만들고(임의로 100번지로 함) 주소값을 a에 부여
		a.name = "신동호"; // 100번지를 통해 힙에 이름 저장
		a.age = 20; // 100번지를 통해 힙에 나이 저장
		a.pNum = "01098765432"; // 100번지를 통해 힙에 폰번호 저장
		a.uNum = 64; // 100번지를 통해 힙에 고유번호 저장
		getInfo(a); // a의 주소값을 가지고 6번 라인으로 올라가서 getInfo메서드를 실행시키고 돌아옴
		
		Person b = new Person();
		b.name = "김종훈";
		b.age = 24;
		b.pNum = "01036985214";
		b.uNum = 23;
		getInfo(b);
		getInfo(new Person()); // String타입은 null로, int타입은 0으로 뜬다.

	} // main지역이 사라지므로 힙에 저장된 주소, 데이터가 전부 삭제되고 종료.

}
