package ch03;

import java.util.Scanner;

public class project01_1 {
	public static void main(String[] args) {
		int result; // 팩토리얼 결괏값 저장
		int n; // 키보드에서 입력받을 정수 저장
		
		Scanner in = new Scanner(System.in);
		
		// 키보드로 정수를 입력받고 팩토리얼 값을 계산하는 코드
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		result = 1;
		while (true) {
			if (n <= 0) {
				System.out.println(result);
				break;
			} else {
				result = result * n;
				n--;
			}
		}
		
		
	}
}
