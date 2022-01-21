
public class SwitchCase02P101 {
	
	public static void main(String[] args) {
		// 범위인것처럼 switch~case문을 쓰고싶다면
		// 하나의 break에 여러 case문이 걸리도록 작성합니다.
		int score = 17;
		
		switch (score) {
		    case 10 : // case별로 매칭할 때 break가 없으면 계속 내려가는 점을 이용해서
		    case 9 : // break를 여러 케이스당 하나씩만 배치하면 됩니다.
		    	System.out.println("수");
		    	break;
		    case 8 :
		    case 7 :
		    	System.out.println("우");
		    	break;
		    case 6 :
		    case 5 :
		    	System.out.println("미");
		    	break;
		    case 4 :
		    case 3 :
		    	System.out.println("양");
		    	break;
		    case 2 :
		    case 1 :
		    	System.out.println("가");
		    	break;
		    default : 
		    	System.out.println("점수가 올바르지 않습니다.");
		}
	}

}
