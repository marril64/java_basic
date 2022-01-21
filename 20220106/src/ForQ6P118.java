
public class ForQ6P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 중첩 반복문을 사용해 코드를 작성해주세요.
		// *
		// **
		// ***
		// ****
		// 중첩 반복문의 어느 지점이 다음줄로 내리고, 어느 부분이 별을 나열하는지 생각해보세요.
		
		int a = 4;
		
		/*for (int i = 0; i < a; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		int k = 0;
		while (k < a) {
			int l = 0;
			while (l < (k + 1)) {
				System.out.print("*");
				l++;
			}
			System.out.println();
			k++;
		}

	}

}
