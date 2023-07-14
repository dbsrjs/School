import java.util.Scanner;

public class Project9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 ?");
		int row = sc.nextInt();
		System.out.println("세로 ?");
		int wol = sc.nextInt();
		
		int 넓이 = add(row, wol);
		
		System.out.println(넓이);
	}

	static int add(int row, int wol) {
		int 넓이 = row * wol;
		return 넓이;
	}
	

}
