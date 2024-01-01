package ch03;

import java.util.Scanner;

public class project02 {
	public static void main(String[] args) {
		int result;
		int n;
		
		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		
		result = factorial(n);
		System.out.println(result);
	}
	
	static int factorial(int x) {
		int r = 1;
		// 팩토리얼 값을 계산하는 코드
		while (x > 0) {
			r = r * x;
			x--;
		}
		return r;
	}
}
