import java.util.Scanner;

public class dbs11219 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (; num > 0;)
		{
			System.out.println(num % 10);
			num /= 10;
		}
}
