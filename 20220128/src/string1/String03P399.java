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
		for (int i = 0; i < longString.length(); i++) { // 한바퀴 돌고 나서 마지막으로 발견한 지점에 1 증가하고 시작
			
			// 인덱스 찾기
			int a = longString.indexOf(shortString, i);
			
			// 원하는 단어가 나오지 않을 경우 더이상 for문을 돌릴 필요가 없다.
			if (a == -1) {
				break;
			}
			
			// if문을 통과하면 찾는 단어가 있다는 뜻이므로 count 1 증가
			count += 1;
			
			// 원하는 문장을 마지막으로 발견한 지점을 i에 저장
			i = longString.indexOf(shortString, a);
			
			// 중간과정 콘솔에 출력
			System.out.println(a + "번 인덱스에서 " + count + "번째 " + shortString + " 이(가) 검출되었습니다.");
			
		}
		
		// 결론 콘솔에 출력
		System.out.println(shortString + "의 총 출현 횟수는 " + count + "입니다.");

	} // while문 꼭 써보쟈

}
