package Polimorfismo;

import java.util.Random;

public class P3 {
	
	public static void main(String args[]) {
		
		Random rd = new Random();
		int x[] = new int[10];
		for (int i = 0; i < 10; i++) {
			x[i] = rd.nextInt(100);
			System.out.printf("x[%d] = %d\n", i, x[i]);
		}
	}
}
