import java.util.Scanner;

public class num
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
				
		int sum = 0;
		System.out.println("숫자를 입력해 주세요.");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			if (i % 2 == 0)
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}
}