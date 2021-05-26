package tratamento_e_execao;

public class Exemplo1 {

	public static void main(String args[]) {
		 System.out.println("Início do método main");
		 try {
		 Teste1 ts = new Teste1();
		 int x = 10;
		 int y = 0;
		 System.out.printf("%d dividido por %d = %d\n",x,y,ts.calculo(x, y));
		 } catch (ArrayIndexOutOfBoundsException  e) {
		 System.out.println("Não pode dividir por zero!");
		 }finally{
		 System.out.println("Fim do try..catch");
		 }
		 System.out.println("Fim do método main");
		 }	
}
