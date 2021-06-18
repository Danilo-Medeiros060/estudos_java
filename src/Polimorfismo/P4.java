package Polimorfismo;

import java.util.Scanner;
public class P4 {

	public static void main(String args[]) {
		 ClienteEspecial ce = new ClienteEspecial();
		 Scanner sc = new Scanner(System.in);
		 double desconto;
		 ce.setTotalCompra(1000);
		 System.out.println("Cliente especial? (s ou n)");
		 char resposta = sc.next().charAt(0);
		 if(resposta == 's') ce.verificaStatus(true);
		 else ce.verificaStatus(false);

		 System.out.printf("Valor final a pagar com desconto: R$ %.2f\n",
		 ce.getTotalCompra());
		 }
}
