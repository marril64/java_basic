package arrays1;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// Arrays.sort(배열); 은 배열 내부 순서를
		// 작은 숫자일수록 0에 가깝게, 큰 숫자일수록 마지막에 가깝게 배치합니다.
		int[] arr = {21, 60, 32, 44, 1, 69, 99, 89, 36, -2, -4, -6, 0};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); // 거품정렬은 자료구조 중 최악이므로 사용을 어지간하면 하지말자..

	}

}
