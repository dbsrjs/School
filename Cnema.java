import java.util.Scanner;

public class Cnema {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ��ȭ ���� ���α׷�
		// 2���� �迭 ���
		
		// ���� �¼� ����
		// �¼� ����
		// ���� Ȯ��
		// ����
		
		System.out.println("\r\n" + 
				"                                         __  __         ______                                              \r\n" + 
				"                                        /  |/  |       /      \\                                             \r\n" + 
				"  _______  __    __  _______    ______  $$/ $$ |      /$$$$$$  | _______    ______   _____  ____    ______  \r\n" + 
				" /       |/  |  /  |/       \\  /      \\ /  |$$ |      $$ |  $$/ /       \\  /      \\ /     \\/    \\  /      \\ \r\n" + 
				"/$$$$$$$/ $$ |  $$ |$$$$$$$  |/$$$$$$  |$$ |$$ |      $$ |      $$$$$$$  |/$$$$$$  |$$$$$$ $$$$  | $$$$$$  |\r\n" + 
				"$$      \\ $$ |  $$ |$$ |  $$ |$$ |  $$ |$$ |$$ |      $$ |   __ $$ |  $$ |$$    $$ |$$ | $$ | $$ | /    $$ |\r\n" + 
				" $$$$$$  |$$ \\__$$ |$$ |  $$ |$$ \\__$$ |$$ |$$ |      $$ \\__/  |$$ |  $$ |$$$$$$$$/ $$ | $$ | $$ |/$$$$$$$ |\r\n" + 
				"/     $$/ $$    $$/ $$ |  $$ |$$    $$ |$$ |$$ |      $$    $$/ $$ |  $$ |$$       |$$ | $$ | $$ |$$    $$ |\r\n" + 
				"$$$$$$$/   $$$$$$/  $$/   $$/  $$$$$$$ |$$/ $$/        $$$$$$/  $$/   $$/  $$$$$$$/ $$/  $$/  $$/  $$$$$$$/ \r\n" + 
				"                              /  \\__$$ |                                                                    \r\n" + 
				"                              $$    $$/                                                                     \r\n" + 
				"                               $$$$$$/                                                                      \r\n" + 
				"");
		
		String[][] set = new String[5][5];
		while(true){
			
			System.out.println("���� �¼� Ȯ��(1) / �¼� �����ϱ�(2) / ���� Ȯ���ϱ�(3) / �����ϱ�(4)");
			int who = sc.nextInt();			
			switch (who) {
			case 1:
				System.out.println("------------- ���� �¼� Ȯ�� -------------");
				for (int i = 0; i < set.length; i++) {
					for (int j = 0; j < set.length; j++) {
						if(set[i][j] == null) {
							System.out.printf("��  ");							
						} else {
							System.out.println("��  ");
						}
					}
					System.out.println();
				}
				System.out.println("--------------------------------------");
				System.out.println();
				break;
				
			case 2:
				System.out.println("------------- �¼� ���� �ϱ� -------------");
				System.out.println();
				
				System.out.println("�� ��?");
				int row = sc.nextInt();
				
				System.out.println("�� ��?");
				int col = sc.nextInt();
				if ((row>=0 && row<5) && (col>=0 && col<5)) {					
					System.out.println("�̸�?");
					String name = sc.next();
					
					if (set[row][col] == null) {
						set[row][col] = name;
						System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
					} else {
						System.out.println("�̹� ���õ� �¼��Դϴ�. �ٽ� �õ����ּ���.");					
					}
				} else {
					System.out.println("�ٽ� �Է����ּ���.");
				}
				break;
				
			case 3:
				System.out.println("------------- �¼� ���� Ȯ�� -------------");
				System.out.println("�������� ������ �Է����ּ���.");
				String rsv = sc.next(); 
				
				for (int i = 0; i < set.length; i++) {
					for (int j = 0; j < set.length; j++) {
						if(set[i][j] == rsv) {
							System.out.println("�¼�" +i+ "��" +j+ "�� �Դϴ�.");
						} else {
							System.out.println("�ش� ������ ���� �����ڰ� �������� �ʽ��ϴ�.");
						}						
					}
				}
					System.out.println();
				
				break;
			case 4:
				System.out.println("------------- ���α׷� ���� -------------");
				System.exit(0);
				break;
			default :
				System.out.println("���� �߻�");
			}
		}		
	}
}
