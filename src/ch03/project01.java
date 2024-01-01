package ch03;

import java.util.Scanner;

public class project01 {
	public static void main(String[] args) {
		int result; // 팩토리얼 결괏값 저장
		int n; // 키보드에서 입력받을 정수 저장
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		result = 1;
		while (n > 0) {
			result = result * n;
			n--;
		}
		
		System.out.println(result);
	}
}
