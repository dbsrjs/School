package dbsrjs;

import java.util.Scanner;

public class dbsrjs11219 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 = 메뉴 \n2 = 종료");
		int a = sc.nextInt();
		
		if (a == 1)
		{
			System.out.println("메뉴 표기");
			System.out.println("연산자 선택\n1, 2, 3, 4"); // 1 = +, 2 = -, 3 = *, 4 = /
			int k = sc.nextInt();
			System.out.println("비연산자1 선택");
			int num1 = sc.nextInt();
			System.out.println("비연산자2 선택");
			int num2 = sc.nextInt();
			if (k == 1) // +
			{
				System.out.print(num1 + "+" + num2 + "=");
				System.out.println(num1 + num2);
			}
			else if (k == 2) // -
			{
				System.out.print(num1 + "-" + num2 + "=");
				System.out.println(num1 - num2);
			}
			else if (k == 3) // *
			{
				System.out.print(num1 + "*" + num2 + "=");
				System.out.println(num1 * num2);
			}
			else if (k == 4) // /
			{
				System.out.print(num1 + "/" + num2 + "=");
				System.out.println(num1 / num2);
			}
		}
		else if (a == 2)
		{
			System.out.println("계산기 종료");
		}
	}
}
