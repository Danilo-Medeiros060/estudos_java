package Carro;

public class Main {
	public static void main(String[] args) {
		
		Carros cr = new Carros();
		
		cr.ano = 2010;
		cr.completo = true;
		cr.cor = "Vermelho";
		cr.modelo = "Onix";
		cr.placa = "PAE344900";
		
		cr.caracteristicas();
	}
}
