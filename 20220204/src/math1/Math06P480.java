package math1;

public class Math06P480 {

	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다.
		// Math.random() 을 이용해 1/3확률로 가위,바위,보를 부여받으며
		// 가위 > 보, 바위 > 가위, 보 > 가위의 상성을 가집니다.
		// 같은 요소가 나오면 무승부입니다.
		// 힌트) 컴퓨터가 이기는 경우, 내가 이기는 경우, 비기는 경우를 따져서
		// 조건식에 ||을 사용합니다.
		
		// 0 = 가위, 1 = 바위, 2 = 보
		// 0 > 2, 1 > 0, 2 > 1
		
		int myValue = (int)(Math.random() * 3);
		int comValue = (int)(Math.random() * 3);
		String mv, cv; // 상수로 처리하면 더 쉽다.
		
		if (myValue == 0) {
			mv = "가위";
		} else if (myValue == 1) {
			mv = "바위";
		} else {
			mv = "보";
		}
		
		if (comValue == 0) {
			cv = "가위";
		} else if (comValue == 1) {
			cv = "바위";
		} else {
			cv = "보";
		}
		
		System.out.println("내가 뽑은것 : " + mv);
		System.out.println("컴퓨터가 뽑은것 : " + cv);
		
		if (myValue == comValue) {
			System.out.println("무승부입니다.");
		} else if ((myValue == 2 && comValue == 0) || (myValue == 0 && comValue == 1) || (myValue == 1 && comValue == 2)) {
			System.out.println("컴퓨터가 승리했습니다.");
		} else {
			System.out.println("내가 승리했습니다.");
		}
	}

}
