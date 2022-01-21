import java.util.Scanner;

public class ElseIfQ1P97 {

	public static void main(String[] args) {
		// 성적 판독기를 만들어보겠습니다.
		// if ~ else if ~ else 구문을 사용해 만들어주세요.
		// 성적기준 95 이상 A+, 90 이상 A0, 85 이상 B+, 80 이상 B0
		// 75 이상 C+, 70 이상 C0, 65 이상 D+, 60 이상 D0
		// 60 미만 F 로 콘솔창에 출력해주세요.
		// 스캐너로 int score; 변수에 성적을 입력한 결과로 콘솔에 성적이 나오면 됩니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적을 입력해주세요.");
		int score = scan.nextInt();
		
		if (score >= 95) {
			System.out.println("A+");
		} else if (score >= 90) {
			System.out.println("A0");
		} else if (score >= 85) {
			System.out.println("B+");
		} else if (score >= 80) {
			System.out.println("B0");
		} else if (score >= 75) {
			System.out.println("C+");
		} else if (score >= 70) {
			System.out.println("C0");
		} else if (score >= 65) {
			System.out.println("D+");
		} else if (score >= 60) {
			System.out.println("D0");
		} else {
			System.out.println("F");
		}

	}

}
