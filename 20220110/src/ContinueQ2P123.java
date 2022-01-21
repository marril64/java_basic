
public class ContinueQ2P123 {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 수학(math) 평균점수를 내주시되, 합격자 평균만 내주세요.
		// 합격점수는 60점 이상입니다.
		
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int mathTotal = 0;
		int mathCount = 0;
		
		for (int mScore : math) {
			
			/*if (mScore >= 60) {
				mathCount++;
				mathTotal += mScore;
				// continue; // 좀 억지로 집어넣은 느낌?
			}
			continue;*/
			
			if (mScore < 60) { // 60점 미만을 걸러내기 위해서는 continue가 필요하다.
				continue;
			} else { // else 안붙여도 상관없긴 함. 
				mathCount += 1;
				mathTotal += mScore;
			}
		}
		System.out.println("수학 합격자는 " + mathCount + "명입니다.");
		System.out.println("수학 합격자 평균은 " + mathTotal / mathCount + "점 입니다.");

	}

}
