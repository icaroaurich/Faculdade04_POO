package opBancaria;
public class Correntista{
	String nome;
	ContaCorrente conta;
	
	public Correntista(String nome){
	this.nome = nome;
	}

	public String getNome(){
	return nome;
	}

	public ContaCorrente getContaCorrente(){
	return conta;
	}
}