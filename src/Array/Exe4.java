package Array;

import java.util.Scanner;
public class Exe4 {
	public static void main(String args[]) {
		double numeros[] = new double[5]; //declarando array 
		Scanner input = new Scanner(System.in); //instanciando o objeto Scanner
	
		int i;
		double soma = 0, media;
		
		System.out.println("Entre com 5 valores");
		for(i=0; i<5; i++) { //armazena os 5 valores dos arrays (sempre começando do 0)
			numeros[i] = input.nextDouble();		
			soma = soma + numeros[i]; // 0 + numero i na posição 0, posição 0 + valor da posição 1, etc.
		}	
		
		media = soma / 5;
		System.out.printf("Média = %.1f",media);
		System.out.println("Notas abaixo da média: ");
		
		for(i=0; i<5; i++) {
			if(numeros[i] < media) {
				System.out.println(numeros[i]);
			}
		}
	}
}
