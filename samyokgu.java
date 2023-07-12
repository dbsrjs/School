package jv_0712;

public class samyokgu {

	public static void main(String[] args) {		
		
		  	int num;
	        int 박수 = 0;
	        for(int i=1; i<=40; i++) {            
	            num = i;
	            while(true) {
	                if(num%10==3 || num%10==6 || num%10==9) {
	                    System.out.println(num+": 짝");
	                    박수++;
	                }
	                num /= 10;
	                if(num==0) {
	                    break;
	                }
	            }
	        }        
	        // 총 박수 횟수 출력하기
	        System.out.printf("1~40까지의 총 박수 : " + 박수);
		}
}
	
