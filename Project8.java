import java.util.Scanner;

public class Project8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		int fack = sc.nextInt();
		int num = 1;
		
		for (int i = 1; i <= fack; i++) {
			num *= i;			
		}
		System.out.println(num);
	}
}
