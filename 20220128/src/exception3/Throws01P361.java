package exception3;

public class Throws01P361 {
	
	public static void doIt(String[] s, int i) throws ArrayIndexOutOfBoundsException { // 예외로 처리할 것을 catch구문으로 던지게 되어있음.
		// 내부가 인덱스 조회이므로, 언제든 ArrayIndexOutOfBoundsException 발생이 가능함
		System.out.println(s[i]);
	}

	public static void main(String[] args) {
		// System.out.println(args);
		// throws와 throw는 완전히 다르다.
		// 특정 메서드 영역에서 발생하는 코드는 엄밀히 말하면 try블럭 외부와
		// 예외발생으로 간주됩니다.
		// 따라서 개념적으로는 try블럭 밖에 있지만 실제로는 try블럭에 속한것처럼 처리하기 위해
		// throws를 사용자 정의 메서드 뒤에 붙여줍니다.
		String[] greetings = {"안녕", "hi", "니하오", "싸왓디"};
		int i = (int)(Math.random() * 5); // 정수 0, 1, 2, 3, 4 중 하나
		// int 타입으로 고정시키고 Math.random()을 돌리면 정수가 나온다.
		
		try { // try 영역을 main지역 내에 만든다.
			doIt(greetings, i);
		} catch (Exception e) { // throws에서 던진걸 catch한다고 생각하면 편하다.
			System.out.println("main지역에서 처리했습니다.");
		}

	}

}
