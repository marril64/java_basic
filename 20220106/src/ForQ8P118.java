
public class ForQ8P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 적어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		//    *
		//   **
		//  ***
		// ****
		
		int a = 4;
		
		for (int i = 0; i < a; i++) {
			// 스페이스
			for (int j = a; j > (i + 1); j--) {
				System.out.print(" ");
			}
			
			// 별
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int k = 0;
		while (k < a) {
			
			// 스페이스
			int l = a;
			while (l > k + 1) {
				System.out.print(" ");
				l--;
			}
			
			// 별
			int m = 0;
			while (m < (k + 1)) {
				System.out.print("*");
				m++;
			}
			
			k++;
			System.out.println();
		}

	}

}
