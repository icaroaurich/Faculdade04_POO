package opBancaria;

public class Credito extends Operacao{
	public Credito(double valor){
		//super.setValor(valor);
    	}
		public double operar(double valor){
			double valorOriginal = super.getValor();
			super.setValor(valorOriginal + valor);
			return valor;
		}
}