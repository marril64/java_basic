
public class ForQ4P117 {

	public static void main(String[] args) {
		// 구구단 2 ~ 9단까지 모두를 출력하는 코드를 작성해주세요
		// 구구단은 2 ~ 9단까지 출력하면 됩니다.
		// 중첩 반복문을 사용해 작성해주세요.
		// 바깥쪽 반복문(int i)는 2 ~ 9까지 반복하게 해 주시고
		// 안쪽 반복문(int j)는 1 ~ 9까지 반복하게 해서
		// i * j를 출력하게 하면 됩니다.
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println("======================");
		}

	}

}
