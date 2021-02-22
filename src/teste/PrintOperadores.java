package teste;

import java.util.Scanner; //Classe Scanner
public class PrintOperadores {
	public static void main (String[] args) {
		
		Scanner input = new Scanner( System.in ); // gerador de scanner
		
		int num1;
		int num2;
		int sum;
		int less;
		int multiplication;
		int division;
		int rest;
		
		System.out.print("Entre com o primeiro numero: "); //promt 
		num1 = input.nextInt(); //Armazena o valor em num1
		
		System.out.print("Entre com o segundo numero: "); 
		num2 = input.nextInt(); //Arnazeba o valor em num2
		
		sum = num1 + num2; //Armazena os valores em sum
		less = num1 - num2;
		multiplication = num1 * num2;
		division = num1 / num2;
		rest = num1 % num2;
		
		System.out.printf("\nA soma é: %d\n", sum);
		/*printF = formatação
		 %d = chama int 
		 , sum = especifica a variavél
		 */
		System.out.printf("A subtração é: %d\n", less);
		System.out.printf("A multiplicação é: %d\n", multiplication);
		System.out.printf("A divisão é: %d\n", division);
		System.out.printf("O resto é: %d\n", rest);
		
		if(rest != 0) {
			System.out.printf("\nO número é ímpar!");
		}
		if(rest == 0) {
			System.out.printf("\nO número é par!");
		}
	}
}
