package dbsrjs;

import java.util.Scanner;

public class Array
{
	public static void main(String[] args)
	{
		int[] array = new int[5];		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		while (a < 5)
		{
			System.out.print("값을 입력해주세요.");
			array[a] = sc.nextInt();
			a++;
		}
		
		for (int 영원 = 0; 영원 < 5; 영원++) 
		{
			System.out.println(array[영원]);
		}		
	}
}
