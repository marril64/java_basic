package static1;

public class Main02P276 {

	public static void main(String[] args) {
		// static 요소는 생성 없이도 활용할 수 있다.
		// 클래스면.변수명 으로 정적변수를 마음대로 호출 가능합니다.
		System.out.println(StaticTest.num2); // main이 실행되기 전에 모든 클래스를 뒤져 static을 찾는다.
		// static을 정적 힙에 생성한 후 main이 만들어진다.
		// System.out.println(staticTest.num1); <- 실행 안됨
		// check도 직접 조회해보세요.
		StaticTest.check(); // public이므로 외부에서 접근해서 호출이 가능하다.
		
		// StaticTest s1을 생성한 후 s1.check(); 를 호출해보세요.
		StaticTest s1 = new StaticTest();
		s1.check();

	}

}
