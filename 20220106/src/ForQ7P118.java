
public class ForQ7P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같이 별을 찍을 수 있도록 코드를 작성해주세요
		// ****
		// ***
		// **
		// *
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		
		int a = 4;
		
		for (int i = 0/*i = a*/; i < a/*i > 0*/; i++/*i--*/) {
			for (int j = a/*int j = 0*/; j > i/*j < a - 1*/; j--/*j++*/) {
				System.out.print("*");
			}
			System.out.println();
		} // 방법이 여러가지 존재함. 공부하자...
		
		int k = 0;
		while (k < a) {
			int l = a;
			while (l > k) {
				System.out.print('*');
				l--;
			}
			System.out.println();
			k++;
		}

	}

}
