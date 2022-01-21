
public class ForQ9P118 {

	public static void main(String[] args) {
		// 중첩 반복문을 이용해서
		// 다음 방정식의 양의 정수
		// 해를 모두 구하시오
		// 4x + 5y = 60
		// x포문, y포문, if문이 필요합니다.
		
		int a = 60;
		int b = 4;
		int c = 5;
		
		for (int x = 1; x < a / 2/*15*/; x++) { // 양의 정수이므로 0이 아닌 1로 시작
			for (int y = 1; y < a / 2/*12*/; y++) {
				if ((b * x) + (c * y) == 60) {
					System.out.println("x는 " + x + ", y는 "+ y + "입니다.");
				}
			}
		}

	}

}
