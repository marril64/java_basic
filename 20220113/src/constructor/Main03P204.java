package constructor;

public class Main03P204 {

	public static void main(String[] args) {
		// 웹툰 생성
		Webtoon spider = new Webtoon("스파이더맨", "마블 코믹스"); // 웹툰의 생성자쪽으로 먼저 이동.
		spider.getInfo();
		spider.uploadWebtoon(); // 100번지의 업로드웹툰으로 이동.
		spider.getInfo();
		spider.uploadWebtoon();
		spider.getInfo();
		spider.completeWebtoon();
		spider.getInfo();
		spider.uploadWebtoon();
		spider.completeWebtoon();
		
		// 웹툰 2개를 만들어서 연재 진행 및 완결까지 시켜보세요.
		// 연재 회차는 3~4회로 해주세요.
		Webtoon tower = new Webtoon("신의 탑", "SIU");
		tower.getInfo();
		tower.uploadWebtoon();
		tower.uploadWebtoon();
		tower.getInfo();
		tower.completeWebtoon();
		tower.getInfo();
		
		Webtoon kubera = new Webtoon("쿠베라", "카레곰"); // 대입 연산자가 나왔으니 Webtoon의 생성자쪽으로 먼저 이동, 두 개의 String타입 데이터를 가지고 간다. Webtoon을 생성한 후 힙의 주소값(임의 100번지)을 스택에 있는 main지역의 변수 kubera에 저장한다.
		kubera.getInfo(); // getInfo 메서드로 이동해서 힙에 저장된 100번지 웹툰의 정보(제목, 작가, 회차, 완결여부)를 콘솔에 출력, 더 할게 없으므로 해당 라인으로 돌아와서 실행할 것이 없는지 확인 후 다음 라인으로 이동.
		kubera.uploadWebtoon(); // uploadWebtoon 메서드로 이동해서 힙에 저장된 100번지 웹툰의 회차를 1 증가, 더 실행할 것이 없으므로 해당 라인으로 다시 이동, 실행할 것이 없는지 확인 후 다음 라인으로 이동. (회차 2)
		kubera.uploadWebtoon(); // uploadWebtoon 메서드로 이동해서 힙에 저장된 100번지 웹툰의 회차를 1 증가, 더 실행할 것이 없으므로 해당 라인으로 다시 이동, 실행할 것이 없는지 확인 후 다음 라인으로 이동. (회차 3)
		kubera.getInfo(); // getInfo 메서드로 이동해서 힙에 저장된 100번지 웹툰의 정보(제목, 작가, 회차, 완결여부)를 콘솔에 출력, 더 할게 없으므로 해당 라인으로 돌아와서 실행할 것이 없는지 확인 후 다음 라인으로 이동.
		kubera.uploadWebtoon(); // uploadWebtoon 메서드로 이동해서 힙에 저장된 100번지 웹툰의 회차를 1 증가, 더 실행할 것이 없으므로 해당 라인으로 다시 이동, 실행할 것이 없는지 확인 후 다음 라인으로 이동. (회차 4)
		kubera.completeWebtoon(); // completeWebtoon 메서드로 이동해서 힙에 저장된 100번지 웹툰의 완결여부를 true로 변경, 더 실행할 것이 없으므로 해당 라인으로 다시 이동, 더 실행할 것이 없는디 확인 후 다음 라인으로 이동.(완결여부 true)
		kubera.getInfo(); // getInfo 메서드로 이동해서 힙에 저장된 100번지 웹툰의 정보(제목, 작가, 회차, 완결여부)를 콘솔에 출력, 더 할게 없으므로 해당 라인으로 돌아와서 실행할 것이 없는지 확인 후 다음 라인으로 이동.
		// main지역의 닫는 부분을 만났으니 프로그램 종료. 그림 좀 그리자.

	}

}
