package stringbuilder1;

public class Builder03P408 {

	public static void main(String[] args) {
		// Delete는 말 그대로 문자열의 일부, 혹은 전체를 삭제합니다.
		// Delete(시작 인덱스 번호, 끝 인덱스 번호)를 입력하면
		// 시작지점부터 끝지점 사이를 삭제해줍니다.
		StringBuilder a = new StringBuilder("asdfasdfasdf");
		System.out.println(a);
		a.delete(3, 10); // 3번 인덱스부터 9번 인덱스까지 삭제해버린다.
		System.out.println(a);

	}

}
