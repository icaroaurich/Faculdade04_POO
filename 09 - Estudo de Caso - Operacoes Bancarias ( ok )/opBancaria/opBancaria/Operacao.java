package opBancaria;

public abstract class Operacao{
	protected double valor;
	
	public abstract double operar();

	public void setValor(double valor){
	this.valor = valor;
	}

	public double getValor(){
	return valor;
	}
}