import java.util.Random;
import java.util.Scanner;

public class dbsrjs
{
	public static void main(String[] args) 
	{
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);		
	       
        int �� = rd.nextInt(9)+1;
        int �� = rd.nextInt(9)+1;
        int �� = rd.nextInt(9)+1;
       
        while(��==��||��==��||��==��) 
        {
            �� = rd.nextInt(9)+1;
            �� = rd.nextInt(9)+1;
            �� = rd.nextInt(9)+1;
        }
        
        System.out.print("���� 3�� �Է��غ�");
        int jyt = sc.nextInt();
       
        if(jyt>999) 
        {
            System.out.println("�� �ٽ���~");
        }
        
        else 
        {
            int t = jyt % 10; // 3
            jyt = jyt / 10; // 12
            int y = jyt % 10; // 2
            jyt = jyt / 10; // 1
            int j = jyt % 10; // 1
           
            int s = 0;
            int b = 0;
            // ��Ʈ����ũ ���� ������ �Ǵ�
            // ��ǻ�� : �� �� ��
            // �Է��� : j  y t
            if(��==j) s++;
            if(��==y) s++;
            if(��==t) s++;
            
            if(j == �� || j == ��) b++;
            if(y == �� || y == ��) b++;
            if(t == �� || t == ��) b++;
        }
	}
}