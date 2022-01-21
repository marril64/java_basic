import java.util.Scanner;

public class ContinueQ1P123 {

	public static void main(String[] args) {
		// 1부터 n까지 총합을 구하되 홀수끼리만 더한
		// 총합을 구하는 구문을 작성해주세요.
		// continue문을 반드시 사용하는 로직으로 작성해주세요.
		// n은 스캐너로 입력받습니다.
		
		// 정수 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("목표 정수를 입력해주세요.");
		
		int goal = scan.nextInt();
		int total = 0;
		
		/*for (int i = 1; true; i += 2) {
			if (total <= goal) {
				total += i;
				System.out.println("현재 1부터 " + i + " 까지 더했습니다.");
				System.out.println("총합은 " + total + "입니다.");
				continue;
			} else {
				System.out.println("현재 1부터 " + i + " 까지 더했습니다.");
				System.out.println("총합은 " + total + "입니다.");
				break;
			}
		}*/
		
		int count = 0; // 0으로 시작할지 1로 시작할지 고민해봐야한다.
		
		// 반복문 만들기
		while(count < goal) {
			count++; // 앞에 배치할지 뒤에 배치할지도 고민해보는게 필요하다.
			
			// count가 짝수면 스킵
			if (count % 2 == 0) {
				continue;
			}
			
			// count가 홀수면 총합 더하기
			total += count;
			System.out.println("현재 1부터 " + count + " 까지 더했습니다.");
			System.out.println("총 합은 " + total + "입니다.");
		}

	}

}
