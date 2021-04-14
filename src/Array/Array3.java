package Array;

public class Array3 {

	public void mostraArray(int valor[]) {
		
		int i;
		for (i = 0; i < valor.length; i++) {
			System.out.println(valor[i]);
		}
		
		//ou
		
		System.out.println("Ou ainda");
		for (int n:valor) {
			System.out.println(n);
		}
	}
}
