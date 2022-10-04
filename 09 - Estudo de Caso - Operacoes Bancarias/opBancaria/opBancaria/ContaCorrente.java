package opBancaria;
public class ContaCorrente{
	private double valor = 0;
	
	public void executarOperacao(Operacao opr){
		valor = valor + opr.operar();
	}

	public double getSaldoAtual(){
	return this.valor;
	}
}