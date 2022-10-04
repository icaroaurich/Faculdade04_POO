package opBancaria;
	
public class Debito extends Operacao{
	public Debito(double valor){
		super.setValor(valor * -1);
    	}

	@Override
	public double operar() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
