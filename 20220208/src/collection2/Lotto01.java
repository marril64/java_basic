package collection2;

import java.util.*;

public class Lotto01 {

	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다.
		// 로또복권 추첨기는 1~45 범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 콘솔에 찍어주도록 만들어주세요.
		// ArrayList의 정렬은 .sort()대신
		// Collections.sort(ArrayList)를 사용합니다.
		List<Integer> lotto = new ArrayList<>();
		Random random = new Random();
		
		/*for (int i = 0; i < 7; i++) {
			
			int result = random.nextInt(45);
			
			if (lotto.contains(result + 1)) {
				i--;
			} else {
				lotto.add(result + 1);
			}
			
		}*/
		
		int getNum = 0;
		
		while(lotto.size() != 6) {
			
			getNum = random.nextInt(45);
			
			if (!lotto.contains(getNum + 1)) {
				lotto.add(getNum + 1);
			}
			
		}
		
		/*int sec = lotto.get(6);
		lotto.remove(6);*/ // 위 for문처럼 7개로 정해놓고 해도 된다.
		
		Collections.sort(lotto);
		
		while(lotto.contains(getNum + 1)) {
			getNum = (int)(Math.random() * 45) + 1;
		}
		
		System.out.println("추첨된 번호 : " + lotto);
		System.out.println("2등당첨번호 : " + getNum);

	}

}
