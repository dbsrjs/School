import java.util.Scanner;
public class dbs11219 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("라면 끓이기");
		
		System.out.println("가스렌지 앞에 섰다.");
		System.out.println("1.불을 킨다.    2.귀찮다. 생라면 ㄱ");
		int a = sc.nextInt();
		
		if (a == 1)
		{
			System.out.println("불이 켜진다");
			System.out.println("물이 끓는다");
			System.out.println("1.면  && 스프를 넣는다      2.귀찮다. 그냥 편의점 가자");
			int b = sc.nextInt();	
			if (b == 1)
			{
				System.out.println("면과 스프를 넣었다");
			}
			else if (b == 2)
			{
				System.out.println("불을 끊다");
				System.out.println("옷을 입는다");
				System.out.println("집을 나간다");
				System.out.println("편의점을 간다");
				System.out.println("먹을 거를 고른다");
				System.out.println("1.카드로 결제한다      2.현금으로 결제한다      3.들고 튄다");
				int c = sc.nextInt();
				if (c == 1)
				{
					System.out.println("카드를 낸다");
					System.out.println("계산을 기다린다");
					System.out.println("카드를 받고 나온다");
				}
				else if (c == 2)
				{
					System.out.println("현금을 낸다");
					System.out.println("계산을 기다린다");
					System.out.println("잔돈을 받고 나온다");					
				}
				else if (c == 3)
				{
					System.out.println("들고 째낀다");
				}
				else
				{
					System.out.println("다시 생각 해보자");
				}
				
			}
			else
			{
				System.out.println("다시 생각 해보자");
			}
		}
		else if (a == 2)
		{
			System.out.println("라면을 부신다");
			System.out.println("스프와 섞는다");
			System.out.println("라면 먹방을 시작한다");
		}
		else 
		{
			System.out.println("다시 생각 해보자");
			num += 1;
			if (num == 2)
			{				
				System.out.println("걍 쳐 먹지 마");
			}			
		}
	}	
}
