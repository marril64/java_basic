package date1;

import java.util.Date; // 만약 sql로 되어있다면 util로 바꿔야한다.
import java.text.SimpleDateFormat;

public class Date01 {

	public static void main(String[] args) {
		// Date는 날짜를 표현하는 클래스로 DB등과 통신할 때
		// Date를 이용해서 날짜자료를 받아오거나 넘겨주는것이 권장됩니다.
		// 사용시 import java.util.Date를 위에 입력해야 쓸 수 있습니다.
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(now);
		System.out.println(strNow);
		
		// 표현하는 양식을 바꿀때는 SimpleDateFormat을 활용합니다.
		// import를 추가해야 합니다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		// SimpleDateFormat만 적고 ctrl + space만 눌러도 불러와진다.
		// 소괄호 사이에 양식을 넣어야함
		// 양식은 yyyy는 연도, MM은 월, dd는 일, hh는 시, mm은 분, ss는 초
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		// now변수에 들어있는 출력양식을 2022년 02월 07일 aa시 bb분 cc초로 변경해서 콘솔에 찍어주세요.
		// 469페이지에 보시면 simpleDateFormat의 문자 템플릿 목록이 있습니다.
		SimpleDateFormat asdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초, 시간대 : z");
		// 타임존은 z로 표현합니다.
		String strNow3 = asdf.format(now);
		System.out.println(strNow3);

	}

}
