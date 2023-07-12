package jv_0712;

import java.util.Iterator;
import java.util.Scanner;

public class K2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇명");
		int num = sc.nextInt();	//몇명
		int score;
		int sum = 0;	//총점
		
		for (int i = 0; i < num; i++) {
			score = sc.nextInt();
			sum += score;
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (float)sum/num);
	}

}
