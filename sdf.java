package dsf324;
import java.util.Random;
import java.util.Scanner;

public class sdf 
{
	public static void main(String[] args) 
	{
		//C#식 들여쓰기
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("가로");
		int rows = sc.nextInt();
		
		System.out.println("세로");
		int cols = sc.nextInt();
		
		int[][] set = new int [rows][cols];
		
		for(int i=0; i<set.length; i++) 
		{
			for(int j=0; j<set[rows-1].length; j++) 
			{
				set[i][j] = rd.nextInt(rows*cols)+1;
				for(int k=0; k<=i; k++) 
				{
					for(int l=0; l<=cols; l++) 
					{
						if(i == k && j == l)
							continue;
						
						else if(set[i][j] == set[k][l])
							j--;
					}
				}
			}
		}
		
		
	}
}