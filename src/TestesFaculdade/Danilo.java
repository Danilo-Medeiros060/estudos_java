package TestesFaculdade;

import java.util.Scanner;
public class Danilo {
	public static void main (String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		String nome;
		float altura;
		
		System.out.println("Oi! Por favor, insira seu nome e altura em ordem:\n");	
		
		nome = input.next();
		altura = input.nextFloat();
		
		System.out.printf("Ola, "+nome+". Voce tem "+altura+" de altura!\n");
	}
}
