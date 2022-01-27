package exception2;

import java.util.Scanner;

public class TryCatch01P353 {

	public static void main(String[] args) {
		// try~catch 구문은 크게 예외가 발생할 가능성이 있는 구문을 적어두는
		// try 블럭과, 예외가 실제로 발생했을때 대처할 코드를 실행하는
		// catch 블럭으로 나뉩니다.
		
		// 스캐너로 int a, b에 정수를 입력받는 부분까지만 작성해주세요.
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("첫번째 정수를 입력해주세요.");
		int a = scan.nextInt();
		System.out.println("두번째 정수를 입력해주세요.");
		int b = scan.nextInt();*/
		
		// if~else 대신 try~catch를 작성합니다.
		try {
			// try영역에 예외가 발생할 가능성이 있는 구문을 전부 때려넣습니다.
			System.out.println("첫번째 정수를 입력해주세요."); // 문자열을 넣을 가능성이 존재.
			int a = scan.nextInt(); // 사용자가 문자를 넣어둘 가능성이 있다면
			System.out.println("두번째 정수를 입력해주세요."); // try 영역 안에 넣어주는게 안전하다.
			int b = scan.nextInt();
			
			System.out.println("실행 시작!");
			System.out.println(a / b); // 예외가 날 가능성이 존재하는 핵심 구문
			System.out.println("계산 끝!");
		} catch (Exception e) {
			// catch 블록에는 (Exception e)가 기본적으로 들어간다.
			// Exception e 로 적는 경우 예외 종류를 막론하고 전부 처리 가능하다.
			// 추후에 특정한 종류의 예외를 따로 처리하고 싶은 경우는 다른 예외명을 적으면 된다.
			System.out.println("나누는 숫자는 0이 될 수 없습니다.");
		} finally {
			// 모든 try~catch 영역의 로직이 끝나고 나서 실행될 코드
			System.out.println("코드 끝!");
		}

	}

}
