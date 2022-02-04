package stringbuilder2;

public class Builder08P408 {

	public static void main(String[] args) {
		// reverse()는 문자열을 인덱스 순으로 따졌을때
		// 역순으로 나열합니다.
		StringBuilder str = new StringBuilder("가나다라마");
		str.reverse(); // 인덱스번호 역순이라고 보면 된다.
		
		System.out.println(str);

	}

}
