package teste;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo); 
		System.out.print("Uma caneta " + this.cor);
		System.out.println("\nPonta: " + this.ponta);
		System.out.println("Carga: " + this.carga); 
		System.out.println("Está tampada? " + this.tampada); 
	}
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("\n!ERRO!");
		} else {
			System.out.println("\nEstou rabiscando!");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
}
