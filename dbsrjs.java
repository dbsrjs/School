package dbsrjs;

import java.util.Scanner;

public class dbsrjs 
{
	public static void main(String[] args)	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기 입력");
		int array_pos = sc.nextInt();
		
		int[] array = new int[array_pos];
		
		for (int i = 0; i <array.length; i++) 
		{
			System.out.println("입력해주세요");
			array[i] = sc.nextInt();
		}
		
		System.out.print("정렬 전 :");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(" " + array[i]);
		}
		System.out.println();
		
		int min;
		int temp;
		for (int i = 0; i < array.length; i++)
		{
			min = i;
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[min] > array[j])
				{
					min = j;
				}
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
			
			System.out.print("졍렬 후 : ");
			for (int k = 0; k < array.length; k++)
			{
				System.out.print(" " + array[k]);
			}
			System.out.println();
		}
	}
}
