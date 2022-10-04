package opBancaria;
	
public class Debito extends Operacao{
	public Debito(double valor){
		//super.setValor(valor);
    	}
	public double operar(double valor){
		double valorOriginal = super.getValor();
		super.setValor(valorOriginal - valor);
		return valor;
	}
}
