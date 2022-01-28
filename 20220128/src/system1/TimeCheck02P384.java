package system1;

public class TimeCheck02P384 {

	public static void main(String[] args) {
		// try ~ catch구문의 소요시간을 구해주세요.
		// 내부에는 여러분들이 원하는 속성의 예외를 발생시키세요.
		// throw로 발생시키면 됩니다.
		
		long start = System.currentTimeMillis(); // try 시작 전
		System.out.println("try 시작시간 : " + start);
		
		try {
			throw new ArithmeticException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis(); // catch 종료 후
		System.out.println("catch 종료시간 : " + end);
		System.out.println("소요시간 : " + (end - start));

	}

}
