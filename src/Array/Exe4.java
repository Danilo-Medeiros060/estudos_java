package Array;

import java.util.Scanner;
public class Exe4 {
	public static void main(String args[]) {
		double numeros[] = new double[5]; //declarando array 
		Scanner input = new Scanner(System.in); //instanciando o objeto Scanner
	
		int i;
		double soma = 0, media;
		
		System.out.println("Entre com 5 valores");
		for(i=0; i<5; i++) { //armazena os 5 valores dos arrays (sempre come�ando do 0)
			numeros[i] = input.nextDouble();		
			soma = soma + numeros[i]; // 0 + numero i na posi��o 0, posi��o 0 + valor da posi��o 1, etc.
		}	
		
		media = soma / 5;
		System.out.printf("M�dia = %.1f",media);
		System.out.println("Notas abaixo da m�dia: ");
		
		for(i=0; i<5; i++) {
			if(numeros[i] < media) {
				System.out.println(numeros[i]);
			}
		}
	}
}
