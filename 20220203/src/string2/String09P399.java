package string2;

public class String09P399 {

	public static void main(String[] args) {
		// 기본적으로 문자열은 참조형 변수이기 때문에
		// 비교를 할 때 주소값 비교가 일어납니다.
		String a = new String("테스트"); // new 키워드를 쓰면 같은 문자열이라도 힙 안의 다른 주소에 저장된다.
		String b = new String("테스트"); // 실제로 a와 b에는 주소값이 저장되어있다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		String c = "테스트"; // 같은 문자를 같은 장소에 저장한다.
		String d = "테스트";
		System.out.println(c == d);
		
		// .equals()를 이용하면 주소값 비교가 아닌
		// 해당 주소간 문자열 내용물을 비교해 확인해줍니다.
		// b와 a의 내용물 비교를 해주세요.
		System.out.println(b.equals(a));

	}

}
