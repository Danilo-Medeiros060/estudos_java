package Array;
import java.util.*;

public class Array1 {
	
	public void testaArray() {
		
		int i;
		Random var = new Random();
		int valor[] = new int[10];
		
		for (i = 0; i < 10; i++) {
			valor[i] = var.nextInt(100);
			System.out.println("valor["+i+"] = "+valor[i]);
		}
	}
}
