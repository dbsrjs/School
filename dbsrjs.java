import java.util.Scanner;

public class dbsrjs 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        // 1~40까지 진행한다. for문
        for(int i=1; i<=40; i++) 
        {
        	int num = sc.nextInt();
            int 박수 = 0;
           
            while(true) 
            {
                System.out.println(num);
                if(num%10==3 || num%10==6 || num%10==9) 
                {
                    System.out.println(num+": 짝");
                    박수++;
                }
                num = num / 10;
                if(num==0) 
                {
                    break;
                }
            }
            
           System.out.printf("1~4까지의 총 박수 수 : %d", num, 박수);
        }
       
       
        // 3, 6, 9가 들어간 숫자는 박수를 친다.
        // 10으로 나눴을때 나머지가 3,6,9  
        // 6321
        // 6321 % 10 = 1
        // 6321 / 10 = 632
       
        //  632 % 10 = 2
        //  632 / 10 = 63
       
        //   63 % 10 = 3------>짝
        //   63 / 10 = 6
       
        //    6 % 10 = 6------>짝
        //    6 / 10 = 0 <------- 0이 될때까지               
	}
}