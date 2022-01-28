package string1;

import java.util.Scanner;

public class String03P399 {

	public static void main(String[] args) {
		// Scanner를 통해서 전체 문장을 입력받으세요.
		// 다음으로 문장내에서 찾고싶은 단어를 추가로 입력받으세요.
		// 문장 내에 있는 단어들의 인덱스 번호와, 몇 개가 검출되었는지
		// 출력해주는 코드를 작성해보세요.
		
		// 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		// 문장 입력받음
		System.out.println("문장을 입력해주세요.");
		String longString = scan.nextLine();
		
		// 문장내에서 찾고싶은 단어
		System.out.println("찾고싶은 단어를 입력해주세요.");
		String shortString = scan.nextLine();
		
		// 카운트 변수 생성
		int count = 0;
		
		// 검출용 for문 작성
		for (int i = 0; i < longString.length(); i++) {
			int a = longString.indexOf(shortString, i);
			System.out.println(a + "번 인덱스에서 " + (i + 1) + "번째 " + shortString + " 이(가) 검출되었습니다.");
			count += 1;
			i += longString.indexOf(shortString, i); // i 설정 잘해야겠다...
		}
		
		// 결론
		System.out.println(shortString + "의 총 출현 횟수는 " + count + "입니다.");

	}

}
