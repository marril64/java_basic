package collection2;

import java.util.*;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 몇 장을 사야 당첨되는지 시뮬레이션 해보겠습니다.
		
		// 당첨 로또1
		List<Integer> lotto1 = new ArrayList<>();
		// 추첨 로또2
		List<Integer> lotto2 = new ArrayList<>();
		// 1~45값을 받을 변수
		int getNum = 0;
		// 구매 횟수...
		int count = 0;
		
		// 당첨 로또
		for (int i = 0; i < 6; i++) {
			
			getNum = (int)(Math.random() * 45) + 1;
			
			if (lotto1.contains(getNum + 1)) {
				i--;
			} else {
				lotto1.add(getNum + 1);
			}
			
		}
		
		// 당첨 로또 정렬
		Collections.sort(lotto1);
		
		// 내부 for문 - 추첨 로또, 외부 for문 - 숫자 비교
		for (int i = 0; lotto2.size() < lotto1.size(); i++) {
			
			// 구매 횟수 1 증가
			count++;
			
			// 추첨 로또
			for (int j = 0; j < 6; j++) {
				
				getNum = (int)(Math.random() * 45) + 1;
				
				if (lotto2.contains(getNum + 1)) {
					j--;
				} else {
					lotto2.add(getNum + 1);
				}
				
			}
			
			// 추첨 로또 정렬
			Collections.sort(lotto2);
			
			// 숫자 비교 후 일치하면 for문 탈출, 일치하지 않으면 추첨 로또 초기화 
			if (lotto1.equals(lotto2)) {
				System.out.println("" + lotto1 + lotto2);
				continue;
			} else {
				System.out.println("" + lotto1 + lotto2);
				lotto2.clear();
			}
			
		}
		
		// 오늘의 결론 - 로또 사지말자.
		System.out.println("구매한 로또복권의 개수 : " + count);

	}

}
