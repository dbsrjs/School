package dbsrjs;

import java.util.Scanner;

public class dbsrjs 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴 표기");
		System.out.println("연산자 선택\n");
		String op = sc.next();
		System.out.println("비연산자1 선택");
		int num1 = sc.nextInt();
		System.out.println("비연산자2 선택");
		int num2 = sc.nextInt();
		
		switch (op) 
		{
		case "+":
			System.out.println("결과는?" + (num1+num2));
			break;
		case "-":
			System.out.println("결과는?" + (num1-num2));
			break;
		case "*":
			System.out.println("결과는?" + (num1*num2));
			break;
		case "/":
			System.out.println("결과는?" + ((float)num1/num2));
			break;
		default:
			System.out.println("끝");
		}
	}
}
