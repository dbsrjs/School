import java.util.Scanner;

public class dbsrjs 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է����ּ���");
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
		System.out.println("¦���� �� : " + sum_1);
		System.out.println("Ȧ���� �� : " + sum_2);		
	}
}