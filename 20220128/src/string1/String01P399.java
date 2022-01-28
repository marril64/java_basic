package string1;

public class String01P399 {

	public static void main(String[] args) {
		// String 클래스의 주요 메서드 확인
		// 1. charAt(); // 문자열의 특정 인덱스에 있는 단어 하나를 집어서 리턴한다. 
		String greeting = "Hello Java"; // 문자(배)열이다.
		char get = greeting.charAt(6); // 6번 인덱스에 있는 단일문자를 리턴한다.
		System.out.println(get);
		
		// 자바는 문자열 인덱싱을 허용하지 않습니다.
		// System.out.println(greeting[6]);

	}

}
