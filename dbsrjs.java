import java.util.Scanner;

public class dbsrjs 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        // 1~40���� �����Ѵ�. for��
        for(int i=1; i<=40; i++) 
        {
        	int num = sc.nextInt();
            int �ڼ� = 0;
           
            while(true) 
            {
                System.out.println(num);
                if(num%10==3 || num%10==6 || num%10==9) 
                {
                    System.out.println(num+": ¦");
                    �ڼ�++;
                }
                num = num / 10;
                if(num==0) 
                {
                    break;
                }
            }
            
           System.out.printf("1~4������ �� �ڼ� �� : %d", num, �ڼ�);
        }
       
       
        // 3, 6, 9�� �� ���ڴ� �ڼ��� ģ��.
        // 10���� �������� �������� 3,6,9  
        // 6321
        // 6321 % 10 = 1
        // 6321 / 10 = 632
       
        //  632 % 10 = 2
        //  632 / 10 = 63
       
        //   63 % 10 = 3------>¦
        //   63 / 10 = 6
       
        //    6 % 10 = 6------>¦
        //    6 / 10 = 0 <------- 0�� �ɶ�����               
	}
}