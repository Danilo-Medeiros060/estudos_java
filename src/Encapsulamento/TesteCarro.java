package Encapsulamento;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.setMarca("Fiat");
		van.setCor("Vermelho");
		van.setModelo("Uno");
		
		System.out.println(van.getMarca());
		System.out.println(van.getCor());
		System.out.println(van.getModelo());
	}
}
