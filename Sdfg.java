
public class Sdfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int sum = 0;
			int num;
			
			for (int i = 1; i <= 40; i++) {				
				num = i;
				while (true) {
					if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
						sum++;
					}
					num /= 10;
					if(num == 0) {
						break;
					}						
				}					
				
			}
	}

}
