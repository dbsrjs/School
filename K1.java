package jv_0712;

import java.util.Scanner;

public class K1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇까지?");
		int num = sc.nextInt(); 
		
		for(int i=1; i<=num; i++) 
		{
			for(int j =1; j<=9; j++) 
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}
}
