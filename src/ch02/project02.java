package ch02;

import java.util.Scanner;

// 입력된 정수 홀수, 짝수 판별
public class project02 {
	public static void main(String[] args) {
		int n;
		String result;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		n = in.nextInt();
		
		result = (n % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
	}
}
