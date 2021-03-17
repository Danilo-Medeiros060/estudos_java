package A10_03_21;

import java.util.Scanner;
public class ex3 {
	public void avaliaNotas() {
		
		double n1,n2,n3,n4,media,exameFinal,novaMedia;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com 4 notas");
		
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		n3 = input.nextDouble();
		n4 = input.nextDouble();
		media = (n1+n2+n3+n4)/4;
		
		if(media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Qual a nota do exame final?");
			
			exameFinal = input.nextDouble();
			novaMedia = (media + exameFinal)/2;
			
			if(novaMedia >= 5) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		}
	}
}
