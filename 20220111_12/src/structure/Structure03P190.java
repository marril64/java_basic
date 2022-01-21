package structure;

public class Structure03P190 {
	
	public static void getInfo(Cat c) { // getInfo지역 생성, 100번지의 주소값을 받음
		System.out.println(c.race + "의 색은 " + c.color + " 입니다.");
		System.out.println(c.race + "의 몸무게는 " + c.weight + "kg 입니다.");
		System.out.println(c.race + "의 나이는 " + c.age + "살 입니다.");
		System.out.println("--------------------------------");
	} // getInfo지역 메모리(스택)에서 삭제.

	public static void main(String[] args) { // main 에서 첫번째 시작, main지역 생성
		Cat black = new Cat(); // 힙에 100번지(임의 주소값) 생성, 주소값 black에 저장
		black.race = "집고양이"; // 100번지.race 에 집고양이 대입
		black.color = "검은색"; // 100번지.color 에 검은색 대입
		black.weight = 2; // 100번지.weight 에 2 대입
		black.age = 4; // 100번지.age 에 4 대입
		getInfo(black); // 100번지의 정보를 5번라인에 있는 getInfo에 전달, getInfo 실행 후 되돌아옴
		
		Cat white = new Cat();
		white.race = "길고양이";
		white.color = "흰색";
		white.weight = 4;
		white.age = 7;
		getInfo(white);

	} // main지역 메모리(스택)에서 삭제, 더 할게 없으므로 프로그램 종료

}
