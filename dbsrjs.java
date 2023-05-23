import java.util.Scanner;

public class dbsrjs 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력해주세요");
		int a = sc.nextInt();
		
		int sum_1 = 0;
		int sum_2 = 0;
		
		for (int i = 1; i <= a; i++)
		{
			if (i%2 == 0)
			{
				sum_1 += i;
			}
			
			else if (i%2 != 0)
			{
				sum_2 += i;
			}
		}
		System.out.println("짝숭의 합 : " + sum_1);
		System.out.println("홀수의 합 : " + sum_2);		
	}
}