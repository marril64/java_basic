package exception3;

public class Throw01P361 {

	public static void main(String[] args) {
		// throws와 throw는 완전히 다르다.
		// throw는 예외상황이 아니지만 예외를 강제로 발생시킵니다.
		// Math.random()은 0 <= 난수 < 1의 범위를 가지는 난수를 발생시킵니다.
		// 범위를 0 ~ 9로 만들고 싶다면? * (범위수 + 1);
		int randomNum = (int)(Math.random() * 10);
		System.out.println("나온 난수값 : " + randomNum);
		
		try {
			if (randomNum > 3) { // 60% 확률로 예외처리 발생.
				// 발생하지도 않은 ArrayIndexOutOfBoundsException 만들기
				throw new ArrayIndexOutOfBoundsException(); // 고의적으로 예외를 만드는 경우는 테스트를 하고싶을 때 주로 쓰인다.
			} else {
				System.out.println("정상 범위의 난수 발생");
			}
		} catch (Exception e) {
			System.out.println("없던 예외를 만들었습니다.");
			// 콘솔에 예외 상세정보를 보려면 printStackTrace();를 호출합니다.
			e.printStackTrace();
		}
		System.out.println("ahsgoasdlgj");

	}

}
