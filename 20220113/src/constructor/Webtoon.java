package constructor;

public class Webtoon {
	// 웹툰 이름 name, 연재횟수 series, 작가 painter, 완결여부 complete를 가집니다.
	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	// 생성자를 활용해 주세요.
	// 모든 웹툰의 연재횟수는 1로 시작합니다.
	// 모든 연재작은 처음에 완결되지 않은 상태로 시작합니다.
	// 작가와 제목은 그때그때 입력받아 생성합니다.
	public Webtoon(String n, /*int s, */String p/*, boolean c*/) {
		/*if (s == 0) {
			System.out.println("연재 횟수는 1부터 시작합니다.");
		}
		if (s == 1 && c == true) {
			System.out.println("연재작은 처음에 완결될 수 없습니다.");
		} else {
			name = n;
			series = s;
			painter = p;
			complete = c;
		}*/
		name = n;
		series = 1;
		painter = p;
		complete = false;
	}
	
	// 웹툰 정보 조회하기 getInfo()를 만들어주세요.
	public void getInfo() {
		System.out.println("제목 : " + name + ", 작가 : " + painter + ", 회차 : " + series + ", 완결여부 : " + complete);
	}
	
	// 웹툰 회차를 연재시켜줄(회차를 1회 증가시켜줄) uploadWebtoon()을 만들어주세요.
	public void uploadWebtoon() {
		if (complete == true) {
			System.out.println("이미 완결된 웹툰입니다.");
		} else {
			series += 1;
		}
	}
	
	// 웹툰을 완결상태로 바꿔줄 completeWebtoon()을 만들어주세요.
	public void completeWebtoon() {
		if (complete == true) {
			System.out.println("이미 완결된 웹툰입니다.");
		} else {
			complete = true;
		}
	}

}
