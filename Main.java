package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("체중 입력");
		float a = sc.nextFloat();
		System.out.print("키 입력");
		float b = sc.nextFloat();
					
		float bmi = (a/(b*b));
		
		if (bmi < 18.5) 			{
			System.out.println("저체중");			
		}
		
		else if (bmi <= 24.9)		{
			System.out.println("건강");
		}
		
		else if (bmi <= 29.9) 	{
			System.out.println("과체중");
		}
		
		else if (bmi >= 30)		{
			System.out.println("비만");
		}
	}
}
