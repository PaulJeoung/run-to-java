package ch99_midtest;

import java.util.Scanner;

public class CalculatorApp {
	public static void main	(String[] args) {
		
		boolean calculatorApp = true;
		
		Scanner scanner = new Scanner(System.in);
		int x = 0, y = 0;
		String menu = null;
		
		// 두번째 계산 안되는 문제 해결 필요
		
		while(true) {
			System.out.println("메뉴 1.+ 2.- 3.* 4./ 5.exit[q]");
			
			System.out.println("연산을 입력해 주세요 > ");
			menu = scanner.nextLine();
			
			System.out.println("1번째 숫자 입력 > ");
			x = scanner.nextInt();
			
			System.out.println("2번째 숫자 입력 > ");
			y = scanner.nextInt();
			
			// 계산 출력 영역
			if (menu.equals(PLUS_STRING)) {
				System.out.println("결과 > " + plus(x, y));
			} else if (menu.equals(MINUS_STRING)) {
				System.out.println("결과 > " + minus(x, y));
			} else if (menu.equals(MULTIPLE_STRING)) {
				System.out.println("결과 > " + multiple(x, y));
			} else if (menu.equals(DIVIDE_STRING)) {
				System.out.println(divide(x, y));
			} else if (menu.equals("결과 > " + EXIT_STRING)) {
				System.out.println("계산기를 종료 합니다");
				calculatorApp = false;
			} else {
				System.out.println("잘못된 입력입니다. 메뉴로 이동 합니다");
			}	
		}
	}
	
	public static int plus (int x, int y) {
		return x + y;
	}
	public static int minus (int x, int y) {
		return x - y;
	}
	public static int multiple (int x, int y) {
		return x * y;
	}
	public static int divide (int x, int y) {
		return x / y;
	}
	
	private static final String PLUS_STRING = "+";
	private static final String MINUS_STRING = "-";
	private static final String MULTIPLE_STRING = "*";
	private static final String DIVIDE_STRING = "/";
	private static final String EXIT_STRING = "q";
}