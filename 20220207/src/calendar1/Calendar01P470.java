package calendar1;

import java.util.Calendar; // java.util.Calendar;를 import 해야 합니다.

public class Calendar01P470 {

	public static void main(String[] args) {
		// Calendar는 현재 시간을 일반적인 방식이 아닌 요일, 오전/오후 등으로
		// 달력기준으로 표기해주는 방식입니다.
		// Calendar.getInstance(); 를 이용해 사용합니다.
		// 추상클래스여서 new키워드로 직접 생성해 쓸 수 없습니다.
		// Calendar now = new Calendar(); <- 에러뜬다.
		Calendar now = Calendar.getInstance();
		
		// now.get(Calendar.원하는정보); 형식으로 조회합니다.
		System.out.println("년도 : " + now.get(Calendar.YEAR));
		// 월을 조회해보세요. 월은 0부터 셉니다(0이 1월, 11이 12월)
		System.out.println((now.get(Calendar.MONTH)+ 1) + "월");
		// 일은 DAY_OF_MONTH입니다.
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "일"); // DATE로도 대체가능함
		// 요일도 얻을 수 있는데, 요일은 1이 일요일, 7일 토요일입니다.(0이 없음)
		int day = now.get(Calendar.DAY_OF_WEEK); // 향상된 for문이나 switch~case문으로 만들어보자.
		System.out.println("요일 : " + day);
		// 오전 0, 오후 1
		System.out.println("오전, 오후여부 : " + now.get(Calendar.AM_PM));
		System.out.println("시 : " + now.get(Calendar.HOUR));
		System.out.println("분 : " + now.get(Calendar.MINUTE));
		System.out.println("초 : " + now.get(Calendar.SECOND));

	}

}
