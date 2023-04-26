import java.util.Scanner;

public class What 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		

		System.out.println("값을 입력하세요");
		int a = sc.nextInt();
		int c = 0;
		for (int i = 1; i <= a; i++)
		{
			if(i % 2 == 0 || i % 3 == 0)
			{
				 continue;
			}
			c += i;
		}
		System.out.println(c);
	}
}
