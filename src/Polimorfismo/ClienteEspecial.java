package Polimorfismo;

public class ClienteEspecial extends Cliente {
	
	@Override
	 public void descontoCompra() {
	 totalCompra = totalCompra * 0.9;//10% de desconto
	 }
	 public void verificaStatus(boolean especial){
	 if(especial == true) descontoCompra();
	 else super.descontoCompra();
	 }
}

