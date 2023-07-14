import java.util.Scanner;

public class Project7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("언제까지?");
			int num = sc.nextInt();
			
			int num1 = 0;	//짝수
			int num2 = 0;	//홀수
			
			for (int i = 1; i <= num; i++) {
				if (i%2 == 0) {
					 num1 += i;
				}
				else {
					num2 += i;
				}
			}
			
			System.out.println("짝수 : " +num1);
			System.out.println("홀수 : " +num2);
	}

}
