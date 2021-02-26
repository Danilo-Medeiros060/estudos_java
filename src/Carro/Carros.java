package Carro;

public class Carros {
	
	String modelo;
	String cor;
	String placa;
	float combustivel;
	boolean completo;
	int ano;
	
		void caracteristicas() {
			
			System.out.println("Qual o modelo do seu carro? " + this.modelo);
			
			System.out.println("\nQual a cor do seu carro? " + this.cor);
			
			System.out.println("\nQual a placa do seu carro? " + this.placa);
			
			System.out.println("\nCompleto? " + this.completo);
			
			System.out.println("\nQual o ano do seu carro? " + this.ano);
		}	
		
		void tanque() {
			
		}
		
}
