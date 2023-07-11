package main;

import java.util.Iterator;
import java.util.Scanner;

public class Pac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇까지?");
		int num = sc.nextInt();
		long sum = 1;
		
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}

}
