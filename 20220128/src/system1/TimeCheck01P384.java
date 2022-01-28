package system1;

public class TimeCheck01P384 {

	public static void main(String[] args) {
		// currentTimeMills의 자료는 long형에 저장해야 합니다.
		// 시작지점
		long start = System.currentTimeMillis();
		System.out.println("시작시간 : " + start);
		
		long all = 0;
		
		for (long i = 0; i < 200000000000L; i++) { // long에 넣어줄 값은 끝에 L을 붙인다.
			all += i;
		}
		System.out.println("1부터 2000억까지 총합 : " + all); // 약 54~55초
		
		// 끝나는 시점
		long end = System.currentTimeMillis();
		System.out.println("끝난시간 : " + end);
		System.out.println("소요시간 : " + (end - start));

	}

}
