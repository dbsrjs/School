package dbsrjs;

import java.util.Random;
import java.util.Scanner;

public class dbsrjs 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
		Random rand = new Random();
		
		int soju = rand.nextInt(49) + 1;
		System.out.println("몇일까");
		
		int num = 1;
		
		while (true) 
		{		
			int a = sc.nextInt();	
			if (soju > a)
			{
				System.out.println("UP");
				num++;
			}
			
			else if (soju < a)
			{
				System.out.println("DOWN");
				num++;
			}
			
			else if (soju == a)
			{
				System.out.println("같다");
				System.out.println(num +"번 도전");
				break;
			}
			
			else
			{
				System.out.println("1부터 50까지의 숫자만 입력");
			}
		}
	}
}
