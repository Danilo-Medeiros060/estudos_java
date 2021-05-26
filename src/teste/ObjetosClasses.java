package teste;

public class ObjetosClasses {
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.cor = "vermelha";
		c1.ponta = 0.5f;
		
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
	}

}
