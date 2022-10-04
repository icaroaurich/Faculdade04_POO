package opBancaria;

public abstract class Operacao{
	private double valor;
	
	public abstract double operar(double valor);

	public void setValor(double valor){
	this.valor = valor;
	}

	public double getValor(){
	return valor;
	}
}